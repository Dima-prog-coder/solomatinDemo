package task1;

public class Roma {
    public static int solve(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i ++ ) {
            if (arr.length == 1) {
                return arr[i];
            }
            if (i == 0) {
                if (arr[i] > maxValue && arr[i + 1] != 0) {
                    maxValue = arr[i];
                }
            }
            else if (i == arr.length - 1) {
                if (arr[i] > maxValue && arr[i - 1] != 0) {
                    maxValue = arr[i];
                }
            }
            else {
                if (arr[i] > maxValue && arr[i - 1] != 0 && arr[i + 1] != 0) {
                    maxValue = arr[i];
                }
            }
        }
        if (maxValue == Integer.MIN_VALUE) {
            return 0;
        }
        return maxValue;
    }
}
