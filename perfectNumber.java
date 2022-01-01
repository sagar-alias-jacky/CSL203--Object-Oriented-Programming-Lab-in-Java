import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = s.nextInt();

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }

        if (sum == num)
            System.out.println("The given number is a perfect number.");

        else
            System.out.println("The given number is not a perfect number.");

        s.close();
    }
}
