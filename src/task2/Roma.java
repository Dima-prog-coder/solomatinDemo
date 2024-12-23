package task2;

import java.util.Arrays;

public class Roma {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 5, 5};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void solve(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int maxIndex = findMaxValue(arr);
        int minIndex = findMinValue(arr);

        int per = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = per;
    }

    public static int findMinValue(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMaxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                index = i;
            }
        }
        return index;
    }
}
