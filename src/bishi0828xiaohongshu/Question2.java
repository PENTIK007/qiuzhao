package bishi0828xiaohongshu;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long[] fashu = new long[n];
        for (int i = 0; i < n; i++) {
            fashu[i] = scanner.nextLong();
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (fashu[i] * fashu[j] >= k) {
                    res++;
                }
            }
        }
        res = res * 2;
        System.out.println(res);
    }
}
