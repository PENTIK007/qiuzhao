package bishi1016tengxun;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/10/16 19:53
 * @describe:
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + a[i - 1];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = a[i - 1] + dp[i - 1][j];
                if (j - 1 >= 0) {
                    int temp = a[i - 1];
                    int count = j - 1;
                    while (count >= 0) {
                        dp[i][j] = Math.min(dp[i][j], countOne(temp) + dp[i - 1][count]);
                        temp = countOne(temp);
                        count--;
                    }
                }
            }
        }
        System.out.println(dp[n][k]);
    }

    private static int countOne(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}
