import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        CalculationHistory history = new CalculationHistory();

        while (true) {

            System.out.println("\n SIMPLE CALCULATOR ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Power (a^b)");
            System.out.println("8. Show History");
            System.out.println("9. Clear History");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            if (choice == 10) {
                System.out.println("Thank you! Exiting... Have a NICE Day!");
                break;
            }

            double a, b, result = 0;
            String record = "";

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    result = calc.add(a, b);
                    record = a + " + " + b + " = " + result;
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    result = calc.subtract(a, b);
                    record = a + " - " + b + " = " + result;
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    result = calc.multiply(a, b);
                    record = a + " * " + b + " = " + result;
                    break;

                case 4:
                    System.out.print("Enter numerator: ");
                    a = sc.nextDouble();
                    System.out.print("Enter denominator: ");
                    b = sc.nextDouble();
                    result = calc.divide(a, b);
                    record = a + " / " + b + " = " + result;
                    break;

                case 5:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    result = calc.square(a);
                    record = "Square of " + a + " = " + result;
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    result = calc.cube(a);
                    record = "Cube of " + a + " = " + result;
                    break;

                case 7:
                    System.out.print("Enter base: ");
                    a = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    b = sc.nextDouble();
                    result = calc.power(a, b);
                    record = a + "^" + b + " = " + result;
                    break;

                case 8:
                    history.show();
                    continue;

                case 9:
                    history.clear();
                    continue;

                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            System.out.println("Result: " + result);
            history.add(record);
        }
    }
}
