import java.util.Scanner;

public class matrixTrans {
    public static void main(String[] args) {
        int big = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int trans[][] = new int[c][r];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                if (i == 0 && j == 0)
                    big = a[i][j];
                if (a[i][j] > big)
                    big = a[i][j];
                trans[j][i] = a[i][j];
            }
        }
        System.out.println("The entered matrix is:");
        display(a, r, c);
        System.out.println("The largest element in the matrix is: " + big);
        System.out.println("The transpose of the matrix is: ");
        display(trans, c, r);
        sc.close();
    }

    static void display(int[][] m, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
