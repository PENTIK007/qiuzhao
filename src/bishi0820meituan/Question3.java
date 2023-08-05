package bishi0820meituan;

import java.util.Scanner;

public class Question3 {
    public static double maxScore = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] isValid = new int[n];
        solution(p, a, isValid, 0, m);
        System.out.println(String.format("%.2f", maxScore));
    }

    public static void solution(int[] p, int[] a, int[] isValid, int yifuxiCount, int m) {
        if (yifuxiCount == m) {
            double sum = 0.0;
            for (int i = 0; i < p.length; i++) {
                if (isValid[i] == 1) {
                    sum += a[i];
                } else {
                    sum += 1.0 * a[i] * p[i] / 100;
                }
            }
            maxScore = Math.max(sum, maxScore);
            return;
        }
        for (int i = 0; i < p.length; i++) {
            if (isValid[i] == 0) {
                isValid[i] = 1;
                yifuxiCount++;
                solution(p, a, isValid, yifuxiCount, m);
                isValid[i] = 0;
                yifuxiCount--;
            }
        }
    }
}
