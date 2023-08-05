package bishi0903dada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        boolean allOushu = true;
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
            if (x[i] % 2 != 0) {
                allOushu = false;
            }
        }
        if (allOushu) {
            System.out.println("XXX");
            return;
        }
        boolean[][] dp = new boolean[n + 1][1000001];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] |= dp[i - 1][j];
                if (j - x[i - 1] >= 0) {
                    dp[i][j] |= dp[i][j - x[i - 1]];
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int j = 1; j < dp[0].length; j++) {
            boolean isValid = true;
            for (int i = 1; i < dp.length; i++) {
                if (dp[i][j]) {
                    isValid = false;
                }
            }
            if (isValid) {
                res.add(j);
            }
        }
        for (Integer i : res) {
            System.out.println(i);
        }
    }
}
