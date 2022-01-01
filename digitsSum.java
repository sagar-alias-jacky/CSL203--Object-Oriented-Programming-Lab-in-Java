import java.util.Scanner;

public class digitsSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = 0, sum = 0;

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        while (n > 0) {
            r = n % 10;
            sum += r;
            n = n / 10;
        }

        System.out.println("The sum of the digits of the given number is: " + sum);

        s.close();
    }
}
