package bishi0903dada;

import java.util.Scanner;

public class Question2 {
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int m = scanner.nextInt();
        String[] strs = str.split(",");
        int[] tasks = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            tasks[i] = Integer.valueOf(strs[i]);
        }
        if (m > tasks.length) {
            System.out.println(-1);
        }
        dfs(tasks, 0, m, 0, 0);
        System.out.println(min);
    }

    private static void dfs(int[] tasks, int index, int m, int days, int sum) {
        if (days == m) {
            min = Math.min(min, sum);
            return;
        }
        int cost = 0;
        for (int i = index; i <= tasks.length - (m - days); i++) {
            cost = Math.max(cost, tasks[i]);
            dfs(tasks, i + 1, m, days + 1, sum + cost);
        }
    }
}
