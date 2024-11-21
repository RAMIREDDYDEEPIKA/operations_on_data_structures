package data.Structures.Sorting;

public class SelectionSortMain
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                {9, 4, 7},
                {3, 8, 1},
                {6, 2, 5}
        };

        selectionSortMatrix(matrix);

        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void selectionSortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            selectionSort(matrix[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
