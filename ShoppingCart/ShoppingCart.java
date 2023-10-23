public class ShoppingCart {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {int sum = calculator.add(10, 10);
             System.out.println("Sum: " + sum);
double quotient = calculator.divide(10, 0);
 System.out.println("Quotient: " + quotient);
        } catch (Exception e) {
            System.out.println("Error"); }
 }
}