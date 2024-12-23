package task3;

public class Roma {
    public static int solve(int[][] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (check(arr[i])) {
                k += 1;
            }
        }
        return k;
    }

    public static boolean check(int[] arr) {
        boolean chet = false;
        boolean nechet = false;
        for (int el : arr) {
            if (el % 2 == 0) {
                chet = true;
            }
            if (el % 2 != 0) {
                nechet = true;
            }
            if (chet && nechet) {
                return true;
            }
        }
        return false;
    }
}
