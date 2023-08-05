package bishi0814wangyileihuo;

import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numArray = new int[n];
        Set<Integer> xSet = new HashSet<>();
        for (int i = 0; i <= 999; i++) {
            xSet.add(i);
        }
        for (int i = 0; i < n; i++) {
            Set<Integer> currentXSet = new HashSet<>();
            numArray[i] = scanner.nextInt();
            currentXSet.add(numArray[i] - 32);
            if (numArray[i] >= 90) {
                int min = numArray[i] - 90;
                int max = numArray[i] - 65;
                for (int j = min; j <= max; j++) {
                    currentXSet.add(j);
                }
            } else if (numArray[i] >= 65) {
                int max = numArray[i] - 65;
                for (int j = 0; j <= max; j++) {
                    currentXSet.add(j);
                }
            }
            xSet.retainAll(currentXSet);
        }
        List<StringBuilder> res = new ArrayList<>();
        for (int x : xSet) {
            int size = res.size();
            res.add(new StringBuilder());
            for (int i = 0; i < n; i++) {
                char c = (char) (numArray[i] - x);
                res.get(size).append(c);
            }
        }
        if (res.size() == 0) {
            System.out.println(0);
        } else if (res.size() == 1) {
            System.out.println(res.get(0));
        } else {
            System.out.println(res.size());
        }
    }
}
