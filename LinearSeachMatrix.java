package data.Structures.Searching;

public class LinearSeachMatrix {
    public static void main(String[] args)
    {
        int[][] matrix = {{1, 2, 3}, {7, 5, 6}, {1, 8, 9}};

        int target = 5;

        int[] result = linearSearch(matrix, target);

        if (result != null) {
            System.out.println("Element found at: Row = " + result[0] + ", Column = " + result[1]);
        }
        else {
            System.out.println("Element not found.");
        }
    }

    public static int[] linearSearch(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
