package data.Structures.Sorting;

import java.util.Arrays;

public class InsertionSortMain
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                {9, 4, 7},
                {3, 8, 1},
                {6, 2, 5}
        };

        sortRows(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void sortRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            insertionSort(matrix[i]);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
