package task3;

import java.util.Arrays;

public class OneString {
//     Решение для тех, кто уже познал этот мир (в одну строку, как завешали питонисты)
    public static int solve(int[][] arr) {
        return (int) Arrays.stream(arr).filter(row -> Arrays.stream(row).boxed().filter(num -> num % 2 == 0).count() != 0 && Arrays.stream(row).boxed().filter(num -> num % 2 == 1).count() != 0).count();

    }
}
