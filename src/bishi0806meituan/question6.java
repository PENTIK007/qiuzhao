package bishi0806meituan;

import java.util.*;

class Main6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] high = new int[n];
        int[] low = new int[n];
        for (int i = 0; i < n; i++) {
            high[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            low[i] = scanner.nextInt();
        }
        int target = n % 2 == 0 ? n / 2 : n / 2 + 1;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(high[i], map1.getOrDefault(high[i], 0) + 1);
            map2.put(low[i], map2.getOrDefault(low[i], 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            Integer value2 = map2.getOrDefault(key, 0);
            if (value + value2 < target) {
                continue;
            }
            ans = Math.min(ans, Math.max(0, target - value));
        }
        System.out.println(ans);
    }
}

public class question6 {
}
