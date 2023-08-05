package bishi0827360;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[] maxArray = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                if (j > 6) {
                    for (int k = j - 6; k <= j; k++) {
                        sum += array[k][i];
                    }
                    maxArray[j] = Math.max(maxArray[j], sum);
                } else {
                    for (int k = 0; k <= j; k++) {
                        sum += array[k][i];
                    }
                    maxArray[j] = Math.max(maxArray[j], sum);
                }
            }
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (i > 6) {
                for (int k = i - 6; k <= i - 1; k++) {
                    sum += res[k];
                }
                res[i] = maxArray[i] + 1 - sum;
            } else {
                for (int k = 0; k <= i - 1; k++) {
                    sum += res[k];
                }
                res[i] = maxArray[i] + 1 - sum;
            }
        }
        int resnum = 0;
        for (int i : res) {
            resnum += i;
        }
        System.out.println(resnum);
    }
}
