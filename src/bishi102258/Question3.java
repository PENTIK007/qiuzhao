package bishi102258;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/10/22 19:47
 * @describe:
 */
public class Question3 {
    static int max = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        dfs(prices, 0, 0);
        System.out.println(max);
    }

    private static void dfs(int[] prices, int sum, int i) {
        if (i >= prices.length) {
            max = Math.max(max, sum);
            return;
        }
        dfs(prices, sum + prices[i], i + 2);
        dfs(prices, sum, i + 1);
    }
}
