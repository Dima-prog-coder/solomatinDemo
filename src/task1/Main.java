package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5,0, 6,0, 3,0, 8, 0}));
    }

    public static int solve(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i + 1] != 0) {
                maxValue = compare(maxValue, arr[i]); // max()
            }
            if (i == arr.length - 1 && arr[i - 1] != 0) {
                maxValue = compare(maxValue, arr[i]);
            }
            if (i - 1 > -1 && i + 1 < arr.length && arr[i - 1] != 0 && arr[i + 1] != 0) {
                maxValue = compare(maxValue, arr[i]);
            }

        }
        return maxValue != Integer.MIN_VALUE ? maxValue : 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
