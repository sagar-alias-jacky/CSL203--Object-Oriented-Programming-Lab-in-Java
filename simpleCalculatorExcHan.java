import java.util.Scanner;

class SimpleCalculator {
    static String x;
    static String y;
    static int n1;
    static int n2;

    static void input() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            x = sc.nextLine();
            n1 = Integer.parseInt(x);
            System.out.print("Enter the second number: ");
            y = sc.nextLine();
            n2 = Integer.parseInt(y);
            System.out.println(n1);
            System.out.println(n2);
        } catch (NumberFormatException e) {
            System.out.print("Exception caught: " + e + "\nThe entered number is not an integer\n");
        }
    }

    static void add() {
        System.out.println("The sum is: " + (n1 + n2));
    }

    static void subtract() {
        System.out.println("The difference is: " + (n1 - n2));
    }

    static void multiply() {
        System.out.println("The product is: " + (n1 * n2));
    }

    static void divide() {
        try {
            if (n2 == 0)
                throw new ArithmeticException("\nDivision by zero is invalid\nPlease enter a non zero divisor");
            System.out.println("The quotient is: " + (n1 / n2));
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1.Input");
            System.out.println("2.Add");
            System.out.println("3.Subtract");
            System.out.println("4.Multiply");
            System.out.println("5.Divide");
            System.out.println("6.Exit");
            System.out.print("\nEnter a choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    subtract();
                    break;
                case 4:
                    multiply();
                    break;
                case 5:
                    divide();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
}