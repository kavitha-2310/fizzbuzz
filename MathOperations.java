public class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int result1 = math.multiply(4, 5);
        double result2 = math.multiply(3.5, 2.2);
        int result3 = math.multiply(2, 3, 4);

        System.out.println("Multiplication of two integers: " + result1);
        System.out.println("Multiplication of two doubles: " + result2);
        System.out.println("Multiplication of three integers: " + result3);
    }
}
