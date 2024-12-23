package task4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static int[][] solve(int rowCount, int colCount) {
        int start = 0;
        int[][] matrix = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            matrix[i] = getRange(start, colCount + start);
            start += 1;
        }
        return matrix;

    }

    public static int[] getRange(int start, int stop) {
//        return IntStream.range(start, stop).toArray(); печалька, эта штука не работает у Соломатина, значит прийдется потеть
        int[] range = new int[stop - start];
        int currentEl = start;
        for (int i = 0; i < range.length; i++) {
            range[i] = currentEl;
            currentEl += 1;
        }
        return range;
    }


}
