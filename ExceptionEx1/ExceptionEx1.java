public class ExceptionExample {
    public static void main(String args[]) {
        int[] values = { 1, 2, 3, 4 };
        badUse(values);}

public static void badUse(int[] values) {
    try {int total = 0;
    for (int i = 0; i < values.length; i++) {
        int index = values[i];
    try {
    total += values[index];
    } catch (Exception e) 
    {total += values[0];}
    }  System.out.println(total);
     } catch (Exception e) {
        System.out.println("Out of bounds"); }
    }
}


