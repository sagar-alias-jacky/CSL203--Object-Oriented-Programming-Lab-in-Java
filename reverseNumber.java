import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int n, num, rem, rev;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of integers you want to reverse: ");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            num = s.nextInt();
            rev = 0;
            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            System.out.println("The reverse of the number is: " + rev);
        }

        s.close();
    }

}
