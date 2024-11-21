package data.Structures.Sorting;

public class BubbleSortMain {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {9, 4, 7},
                {3, 8, 1},
                {6, 2, 5}
        };

        bubbleSortMatrix(matrix);

        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void bubbleSortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            bubbleSort(matrix[i]);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
