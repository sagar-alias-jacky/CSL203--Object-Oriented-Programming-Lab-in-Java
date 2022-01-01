import java.util.Scanner;

class NegativeSizeException extends Exception {
    public String toString() {
        return "Negative value entered in the array!";
    }
}

public class negativeValueExcHan {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0)
                    throw new NegativeSizeException();
            }
        } catch (NegativeSizeException e) {
            System.out.println("Exception caught: " + e);
        }
    }

}