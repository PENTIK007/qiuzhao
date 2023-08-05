package bishi0821zijietiaodong;

import java.util.Scanner;

public class Question4 {
    public static float winCount = 0.0f;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        float allCount = 1.0f;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            allCount *= a[i];
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
            allCount *= b[i];
        }
        dfs(a, b, 0, 0, 0, 0);
        System.out.println(String.format("%.3f", winCount / allCount));
    }

    //private static float getRes(int[] a, int[] b, int indexOfA, int indexOfB, int sumA, int sumB) {
    //    dfs(a, b, indexOfA, indexOfB, sumA, sumB);
    //    return winCount;
    //}

    private static void dfs(int[] a, int[] b, int aIndex, int bIndex, int sumA, int sumB) {
        if (aIndex > a.length - 1 && bIndex > b.length - 1) {
            if (sumA > sumB) {
                winCount++;
            }
            return;
        }
        if (aIndex < a.length && bIndex < b.length) {
            for (int i = 1; i <= a[aIndex]; i++) {
                for (int j = 1; j <= b[bIndex]; j++) {
                    dfs(a, b, aIndex + 1, bIndex + 1, sumA + i, sumB + j);
                }
            }
        } else if (bIndex < b.length) {
            for (int i = 1; i <= b[bIndex]; i++) {
                dfs(a, b, aIndex, bIndex + 1, sumA, sumB + i);
            }
        } else if (aIndex < a.length) {
            for (int i = 1; i <= a[aIndex]; i++) {
                dfs(a, b, aIndex + 1, bIndex, sumA + i, sumB);
            }
        }
    }
}
