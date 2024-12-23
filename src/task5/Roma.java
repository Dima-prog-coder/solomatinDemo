package task5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Roma {
    public static Map<Integer, Integer> solve(List<Integer> list) {
        Map<Integer, Integer> data = puttingData(list);
        int k = findMaxDating(data);
        Map<Integer, Integer> res = new HashMap<>();

        Set<Map.Entry<Integer, Integer>> entrySet = data.entrySet();
        for (Map.Entry<Integer, Integer> pair : entrySet) {
            if (pair.getValue() == k) {
                res.put(pair.getKey(), list.indexOf(pair.getKey()));
            }
        }
        return res;
    }

    public static Map<Integer, Integer> puttingData(List<Integer> list) {
        Map<Integer, Integer> findMax = new HashMap<>();
        for (int i = 0; i < list.size(); i ++) {
            findMax.put(list.get(i), findMax.getOrDefault(list.get(i), 0) + 1);
        }
        return findMax;
    }

    public static int findMaxDating(Map<Integer, Integer> data) {
        int maxFinding = Integer.MIN_VALUE;
        for (int value : data.values()) {
            if (value > maxFinding) {
                maxFinding = value;
            }
        }
        return maxFinding;
    }
}
