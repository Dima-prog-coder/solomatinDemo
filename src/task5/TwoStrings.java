package task5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TwoStrings {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 1, 3, 5, 1, 6, 1, 7, 7, 2, 5);
        Map<Integer, Integer> map = solve(list);
        System.out.println(map);
    }
    public static Map<Integer, Integer> solve(List<Integer> list) {
        AtomicInteger maxRepeat = new AtomicInteger(Integer.MIN_VALUE);
        return list.stream().peek(num ->  list.stream().forEach( num2 -> {long cnt = list.stream().filter(num1 -> num1.equals(num2)).count();if (maxRepeat.get() < cnt) {maxRepeat.set((int) cnt);}})).filter(num -> list.stream().filter(numIns -> numIns.equals(num)).count() == maxRepeat.get()).distinct().collect(Collectors.toMap(num -> num, num -> list.indexOf(num)));
    }
}
