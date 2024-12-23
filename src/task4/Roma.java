package task4;

public class Roma {
    public static int[][] solve(int rowCount, int colCount) {
        int[][] arr = new int[rowCount][colCount];
        for (int i = 0; i < arr.length; i ++) {
            int k = i;
            for (int j = 0; j < arr[i].length; j ++) {
                arr[i][j] = k;
                k += 1;
            }
        }
        return arr;
    }
}
