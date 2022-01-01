import java.util.Scanner;

class QuickSort {

    static int partition(String A[], int low, int high) {
        String pivot = A[low];
        int i = low;
        int j = high;
        String temp;

        do {
            while (A[i].compareToIgnoreCase(pivot) <= 0) {
                i++;
            }

            while (A[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i < j) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        } while (i < j);

        temp = A[low];
        A[low] = A[j];
        A[j] = temp;

        return j;
    }

    static void quickSort(String A[], int low, int high) {
        int partitionIndex;

        if (low < high) {
            partitionIndex = partition(A, low, high);
            quickSort(A, low, partitionIndex - 1);
            quickSort(A, partitionIndex + 1, high);
        }
    }
}

class QSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of names you want to enter: ");
        n = sc.nextInt();
        sc.nextLine();
        String names[] = new String[n];

        System.out.println("\nEnter the names: ");

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        QuickSort.quickSort(names, 0, n - 1);

        System.out.println("\nSorting the array of names using quick sort...");

        System.out.println("\nThe array of names sorted in ascending order is:\n");

        for (String i : names) {
            System.out.println(i);
        }

        sc.close();
    }
}