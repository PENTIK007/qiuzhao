package bishi0831shunfeng;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] parent = new int[n - 1];
        int[] dream = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = scanner.nextInt();
        }
        for (int i = 0; i < dream.length; i++) {
            dream[i] = scanner.nextInt();
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (dream[i] > 0) {
                max = Math.max(max, dream[i]);
            }
            if (dream[i] < 0) {
                min = Math.min(max, dream[i]);
            }
        }
        int res = max - min + Math.abs(dream[0] + min - max);
        System.out.println(res);
    }
}
