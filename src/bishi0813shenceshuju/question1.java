package bishi0813shenceshuju;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arrs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrs[i][j] = scanner.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        list.add(arrs[i][j]);
        while (!(i == n - 1 && j == n - 1)) {
            if (isValid(arrs, i, j + 1)) {
                j++;
                list.add(arrs[i][j]);
            } else if (isValid(arrs, i + 1, j)) {
                i++;
                list.add(arrs[i][j]);
            }
            while (isValid(arrs, i + 1, j - 1)) {
                i++;
                j--;
                list.add(arrs[i][j]);
            }

            if (isValid(arrs, i + 1, j)) {
                i++;
                list.add(arrs[i][j]);
            }else if(isValid(arrs, i, j + 1)) {
                j++;
                list.add(arrs[i][j]);
            }
            while (isValid(arrs, i - 1, j + 1)) {
                i--;
                j++;
                list.add(arrs[i][j]);
            }
        }
        for (int num : list) {
            System.out.print(num);
            System.out.print(" ");
        }
    }

    private static boolean isValid(int[][] arrs, int i, int j) {
        return (i >= 0 && i < arrs.length) && (j >= 0 && j < arrs[0].length);
    }
}
