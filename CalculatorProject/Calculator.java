public class Calculator {

    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public double square(double a) { return a * a; }

    public double cube(double a) { return a * a * a; }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
