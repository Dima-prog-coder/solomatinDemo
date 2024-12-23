package task4;

import java.util.Arrays;

public class Roma {
    public static void main(String[] args) {
        for (int[] row : solve(3, 3)) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] solve(int rowCount, int colCount) {
        int[][] arr = new int[rowCount][colCount];
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 1;
            }
        }
        return arr;
    }
}
