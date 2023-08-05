package bishi0831shunfeng;

import java.util.Scanner;

public class Question1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long res = 0;
        long dp[] = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i / 2] + 1;
        }
        for (int i = 0; i <= n; i++) {
            res += dp[i];
        }
        System.out.println(res);
    }
}
