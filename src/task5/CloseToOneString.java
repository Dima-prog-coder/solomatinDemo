package task5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloseToOneString {
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
        int maxCntInList = Integer.MIN_VALUE;
        for (int num : list) {
            if (countElInList(num, list) > maxCntInList) {
                maxCntInList = countElInList(num, list);
            }
        }
        int finalMaxCntInList = maxCntInList;
        Map<Integer, Integer> map = new HashMap<>();
        list.stream().filter(digit -> countElInList(digit, list) == finalMaxCntInList).forEach(digit->map.put(digit, list.indexOf(digit)));
        return map;

    }
}
