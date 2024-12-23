package task5;

import java.util.*;

public class Main {
    public static int countElInList(int el, List<Integer> lst) {
        int cnt = 0;
        for (int num : lst) {
            if (num == el) {
                cnt += 1;
            }
        }
        return cnt;
    }

    public static Map<Integer, Integer> solve(List<Integer> list) {
        List<Integer> maxRepeatedEls = findNumWithMaxRepeat(list);
        Map<Integer, Integer> maxRepeatedElementsWithIndex = new HashMap<>();
        for (int i = 0; i < maxRepeatedEls.size(); i++) {
            if (!maxRepeatedElementsWithIndex.containsKey(maxRepeatedEls.get(i))) {
                maxRepeatedElementsWithIndex.put(maxRepeatedEls.get(i), list.indexOf(maxRepeatedEls.get(i)));
            }
        }
        return maxRepeatedElementsWithIndex;
    }

    public static List<Integer> findNumWithMaxRepeat(List<Integer> lst) {
        int maxRepeat = 0;
        List<Integer> maxRepeatedEls = new ArrayList<>();
        for (int num : lst) {
            if (countElInList(num, lst) > maxRepeat) {
                maxRepeatedEls.clear();
                maxRepeatedEls.add(num);
                maxRepeat = countElInList(num, lst);
            } else if (countElInList(num, lst) == maxRepeat) {
                maxRepeatedEls.add(num);
            }
        }
        return maxRepeatedEls;
    }
}
