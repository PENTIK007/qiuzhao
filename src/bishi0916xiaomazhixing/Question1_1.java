package bishi0916xiaomazhixing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/16 19:35
 * @describe:
 */
public class Question1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long[] candies = new long[n];
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextLong();
        }
        long[] temp = Arrays.copyOf(candies, n);
        Arrays.sort(temp);
        int count = 0;
        int length = n;
        int index = 0;
        while (true) {
            if (temp[index] - count <= 0) {
                index++;
                length--;
            }
            if ((temp[index] - count) * length < k) {
                k -= (temp[index] - count) * length;
                count += (temp[index] - count);
                length--;
                index++;
            } else {
                count += k / length;
                k = k % length;
                break;
            }
        }
        int i = 0;
        for (i = 0; i < n; i++) {
            if (candies[i] - count > 0) {
                k--;
            }
            if (k == 0) {
                break;
            }
        }
        System.out.println(i + 1);
    }
}
