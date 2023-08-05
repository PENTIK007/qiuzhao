package bishi0916xiaomazhixing;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/16 19:35
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long[] candies = new long[n];
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextLong();
        }
        int index = 0;
        while (k != 0) {
            if (candies[index] > 0) {
                candies[index]--;
                index++;
                k--;
            } else if (candies[index] == 0) {
                index++;
            }
            if (index == n) {
                index = 0;
            }
        }
        System.out.println(index);
    }
}
