import java.util.Scanner;

class matrixMulti {
    public static void main(String args[]) {
        int r1, r2, c1, c2, i, j, k, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of matrix 1: ");
        r1 = sc.nextInt();
        System.out.print("Enter the number columns of matrix 1: ");
        c1 = sc.nextInt();
        
        System.out.print("Enter the number of rows of matrix 2: ");
        r2 = sc.nextInt();
        System.out.print("Enter the number of columns of matrix 2: ");
        c2 = sc.nextInt();

        if (c1 == r2) {

            int mat1[][] = new int[r1][c1];
            int mat2[][] = new int[r2][c2];
            int res[][] = new int[r1][c2];

            System.out.println("Enter the elements of matrix 1:");

            for (i = 0; i < r1; i++) {

                for (j = 0; j < c1; j++)
                    mat1[i][j] = sc.nextInt();

            }
            System.out.println("Enter the elements of matrix2:");

            for (i = 0; i < r2; i++) {

                for (j = 0; j < c2; j++)
                    mat2[i][j] = sc.nextInt();

            }

            System.out.println("\nThe product matrix is:");
            for (i = 0; i < r1; i++)

                for (j = 0; j < c2; j++) {
                    sum = 0;
                    for (k = 0; k < r2; k++) {
                        sum += mat1[i][k] * mat2[k][j];

                    }
                    res[i][j] = sum;
                }
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++)
                    System.out.print(res[i][j] + " ");

                System.out.println();
            }
        } else
        System.out.print("The number of columns of first matrix must be equal to the number of rows of the second matrix for matrix multiplication to be possible.");

        sc.close();
    }

}