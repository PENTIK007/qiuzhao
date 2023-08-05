package bishi0913weizhong;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (a == b) {
                System.out.println(0);
                continue;
            }
            long min = Math.min(a, b);
            long max = Math.max(a, b);
            if (max % min != 0) {
                System.out.println(-1);
                continue;
            }
            long chu = max / min;
            if (chu % 2 != 0) {
                System.out.println(-1);
                continue;
            }
            long count = 0;
            while (chu % 8 == 0) {
                chu /= 8;
                count++;
            }
            while (chu % 4 == 0) {
                chu /= 4;
                count++;
            }
            while (chu % 2 == 0) {
                chu /= 2;
                count++;
            }
            if (chu == 1) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }
}
