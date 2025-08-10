// Calculator class to perform basic arithmetic operations
public class Problem1 {

    public static double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation type.");
        }
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        System.out.println("Add: " + calculate(a, b, "add"));
        System.out.println("Subtract: " + calculate(a, b, "subtract"));
        System.out.println("Multiply: " + calculate(a, b, "multiply"));
        System.out.println("Divide: " + calculate(a, b, "divide"));
    }
}
