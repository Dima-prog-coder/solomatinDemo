package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 3},
                {2, 1, 5, 6}
        };
        System.out.println(solve(arr));
    }

    public static int solve(int[][] arr) {
        int cnt = 0;
        for (int[] row : arr) {
            if (isThereEvenAndOdd(row)) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static boolean isThereEvenAndOdd(int[] arr) {
        boolean wasEven = false;
        boolean wasOdd = false;
        for (int num : arr) {
            if (num % 2 == 0) {
                wasEven = true;
            } else {
                wasOdd = true;
            }
        }
        return wasEven && wasOdd;
    }
}
