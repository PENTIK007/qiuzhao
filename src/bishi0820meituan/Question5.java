package bishi0820meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] needWeight = new int[n];
        int[] weight = new int[m];
        for (int i = 0; i < n; i++) {
            needWeight[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }
        Arrays.sort(needWeight);
        Arrays.sort(weight);
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < n && j < m) {
            if (needWeight[i] <= weight[j]) {
                res += weight[j];
                i++;
                j = 0;
            } else {
                i++;
            }
        }
        res = res == 0 ? -1 : res;
        System.out.println(res);
    }
}
