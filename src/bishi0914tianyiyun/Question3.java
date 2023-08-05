package bishi0914tianyiyun;

import java.util.Scanner;

public class Question3 {
    static int max = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tiLi = scanner.nextInt();
        int count = scanner.nextInt();
        int[] shiyong = new int[count];
        for (int i = 0; i < count; i++) {
            shiyong[i] = scanner.nextInt();
        }
        count = scanner.nextInt();
        int[] haoli = new int[count];
        for (int i = 0; i < count; i++) {
            haoli[i] = scanner.nextInt();
        }
        boolean[] isUsed = new boolean[count];
        dfs(tiLi, shiyong, haoli, isUsed, 0);
        System.out.println(max);
    }

    private static void dfs(int tiLi, int[] shiyong, int[] haoli, boolean[] isUsed, int sum) {
        for (int i = 0; i < shiyong.length; i++) {
            if (tiLi - haoli[i] >= 0 && !isUsed[i]) {
                tiLi -= haoli[i];
                isUsed[i] = true;
                sum += shiyong[i];
                max = Math.max(max, sum);
                dfs(tiLi, shiyong, haoli, isUsed, sum);
                tiLi += haoli[i];
                isUsed[i] = false;
                sum -= shiyong[i];
            }
        }
    }
}
