#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 256
#define MAX_ENTRIES 100

typedef struct {
    char type[20]; //Note: Type of traffic (e.g., "Main", "Diversion", "Pedestrian")
    char direction[10]; //Note: Direction (e.g., "Left", "Right")
    int time; //Note: Time taken in sec
} TrafficEntry;

int calculateMainPedestrianTime(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (!file) {
        perror("Failed to open file");
        return -1;
    }

    TrafficEntry entries[MAX_ENTRIES];
    int count = 0;
    int totalTime = 0;

    while (fgets(entries[count].type, MAX_LINE_LENGTH, file) && count < MAX_ENTRIES) {
        entries[count].type[strcspn(entries[count].type, "\n")] = 0;
        fscanf(file, "%s %d", entries[count].direction, &entries[count].time);
        count++;
    }
    fclose(file);

    for (int i = 0; i < count; i++) {
        if (strcmp(entries[i].type, "Pedestrian") == 0 && strcmp(entries[i].direction, "Main") == 0) {
            totalTime += entries[i].time;
        }
    }

    return totalTime;
}

int main() {
    int totalTime = calculateMainPedestrianTime("traffic.dat");
    if (totalTime != -1) {
        printf("Total time before a main pedestrian can cross: %d seconds\n", totalTime);
    }
    
    return 0;
}
