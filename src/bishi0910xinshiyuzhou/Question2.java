package bishi0910xinshiyuzhou;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int temp = 0;
            for (int j = i; j < n - 1; j++) {
                temp += Math.pow(-1, j - i) * Math.abs(array[j] - array[j + 1]);
                res = Math.max(temp, res);
            }
        }
        System.out.println(res);
    }
}
