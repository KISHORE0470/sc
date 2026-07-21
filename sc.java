import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Logarithm (Base 10)");
            System.out.println("11. Natural Log");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            double a, b;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();

                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Error! Division by zero.");
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(a));
                    break;

                case 6:
                    System.out.print("Enter base: ");
                    a = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    b = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(a, b));
                    break;

                case 7:
                    System.out.print("Enter angle (degrees): ");
                    a = sc.nextDouble();
                    System.out.println("sin = " + Math.sin(Math.toRadians(a)));
                    break;

                case 8:
                    System.out.print("Enter angle (degrees): ");
                    a = sc.nextDouble();
                    System.out.println("cos = " + Math.cos(Math.toRadians(a)));
                    break;

                case 9:
                    System.out.print("Enter angle (degrees): ");
                    a = sc.nextDouble();
                    System.out.println("tan = " + Math.tan(Math.toRadians(a)));
                    break;

                case 10:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    System.out.println("log = " + Math.log10(a));
                    break;

                case 11:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    System.out.println("ln = " + Math.log(a));
                    break;

                case 12:
                    System.out.println("Thank you for using the Scientific Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 12);

        sc.close();
    }
}