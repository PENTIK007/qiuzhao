package bishi0916xiaomazhixing;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/16 21:17
 * @describe:
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        long res = 0;
        int[] nums = solution(ints, m);
        for (int i : nums) {
            res += i;
        }
        System.out.println(res);
    }

    private static int[] solution(int[] ints, int m) {
        int p = 0;
        while (p <= ints.length - m) {
            for (int i = m - 1; i >= 0; i--) {
                if (ints[p + i] == 0) {
                    p += i + 1;
                    break;
                }
            }
            if (p > ints.length - m) {
                return ints;
            }
            int minV = finMin(ints, p, m);
            for (int i = 0; i < m; i++) {
                ints[p + i] -= minV;
            }
            p++;
        }
        return ints;
    }

    private static int finMin(int[] ints, int p, int m) {
        int res = Integer.MAX_VALUE;
        for (int i = p; i < p + m; i++) {
            res = Math.min(res, ints[i]);
        }
        return res;
    }
}
