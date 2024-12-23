package task2;

public class Main {
    static class MaxMin {
        public int max = Integer.MIN_VALUE;
        public int maxIndex = -1;
        public int min = Integer.MAX_VALUE;
        public int minIndex = -1;
    }

    public static void solve(int[] arr) {
        MaxMin maxMin = findElements(arr);
        changeValues(arr, maxMin.maxIndex, maxMin.minIndex);
    }

    public static void changeValues(int[] arr, int firstIndex, int secondIndex) {
        if (firstIndex == secondIndex){
            return;
        }
        int storage = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = storage;
    }

    public static MaxMin findElements(int[] arr) {
        MaxMin maxMin = new MaxMin();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxMin.max) {
                maxMin.max = arr[i];
                maxMin.maxIndex = i;
            }
            if (arr[i] <= maxMin.min) {
                maxMin.min = arr[i];
                maxMin.minIndex = i;
            }
        }
        return maxMin;
    }

}
