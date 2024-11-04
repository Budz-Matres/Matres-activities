#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 256

void processTrafficData(const char *inputFile, const char *outputFile) {
    FILE *file = fopen(inputFile, "r");
    FILE *resultFile = fopen(outputFile, "w");
    if (!file || !resultFile) {
        perror("Failed to open file");
        return;
    }

    char line[MAX_LINE_LENGTH];
    while (fgets(line, sizeof(line), file)) {
        char type[20], direction[10];
        int time;
        sscanf(line, "%[^,],%[^,],%d", type, direction, &time);
        if (strcmp(type, "Main") == 0) {
            fprintf(resultFile, "Main Lane: %s - %d seconds\n", direction, time);
        } else if (strcmp(type, "Diversion") == 0) {
            fprintf(resultFile, "Diversion Lane: %s - %d seconds\n", direction, time);
        } else if (strcmp(type, "Pedestrian") == 0) {
            fprintf(resultFile, "Pedestrian: %s - %d seconds\n", direction, time);
        }
    }

    fclose(file);
    fclose(resultFile);
}

int main() {
    processTrafficData("traffic_scenarios.csv", "traffic_result.dat");
    printf("Processed traffic scenarios and saved results to traffic_result.dat\n");

    return 0;
}
