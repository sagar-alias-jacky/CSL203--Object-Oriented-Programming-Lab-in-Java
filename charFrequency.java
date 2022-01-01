import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        int frequency = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                frequency++;
            }
        }

        System.out.println("The frequency of the character " + ch + " in the given string is " + frequency);

        sc.close();
    }
}
