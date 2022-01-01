import java.util.StringTokenizer;
import java.util.Scanner;

public class stringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0;
        String s;
        System.out.print("Enter a line of integers: ");
        s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("The entered integers are: ");
        while (st.hasMoreTokens()) {
            s = st.nextToken();
            i = Integer.parseInt(s);
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of the entered integers is: " + sum);
        sc.close();
    }
}
