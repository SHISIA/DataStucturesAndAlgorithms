package BinarySearch2DArray;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int[] notFound = {-1, -1};
        int target = 33;
        if (Arrays.equals(search(matrix, target), notFound)) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at position" + Arrays.toString(search(matrix, target)));
        }
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int column = 0;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            } else if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }
}
