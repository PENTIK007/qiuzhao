package bishi0831guanglianda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] guiding = new int[m + 1][3];
        for (int i = 1; i < m + 1; i++) {
            guiding[i][0] = scanner.nextInt();
            guiding[i][1] = scanner.nextInt();
            guiding[i][1] = scanner.nextInt();
        }
        boolean[] chair = new boolean[n + 1];
        Arrays.sort(guiding, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < m + 1; i++) {
            int count = 0;
            int index = guiding[i][0];
            while (count < guiding[i][2]) {
                if (!chair[index]) {
                    chair[index] = true;
                    index++;
                    count++;
                } else {
                    count++;
                    index++;
                }
            }
        }
        int res = 0;
        boolean[] flag = new boolean[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = guiding[i][0]; j <= guiding[i][1]; j++) {
                flag[j] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!flag[i]) {
                res++;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            if (chair[i]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
