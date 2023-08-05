package bishi0806meituan;

import java.util.*;

public class question2 {
}
class Main2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        int[] xiaoyu0 = new int[n + 1];
        int[] dayu0 = new int[n + 1];
        int[] dengyu0 = new int[n + 1];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
            if (data[i] < 0) {
                xiaoyu0[i + 1] = xiaoyu0[i] + 1;
                dayu0[i + 1] = dayu0[i];
                dengyu0[i + 1] = dengyu0[i];
            } else if (data[i] > 0) {
                xiaoyu0[i + 1] = xiaoyu0[i];
                dayu0[i + 1] = dayu0[i] + 1;
                dengyu0[i + 1] = dengyu0[i];
            } else {
                xiaoyu0[i + 1] = xiaoyu0[i];
                dayu0[i + 1] = dayu0[i];
                dengyu0[i + 1] = dengyu0[i] + 1;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n + 1; i++) {
            int sum = dayu0[i] + xiaoyu0[n] - xiaoyu0[i] + dengyu0[n];
            res = sum < res ? sum : res;
        }
        System.out.println(res);
    }
}
