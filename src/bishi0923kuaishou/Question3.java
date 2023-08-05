package bishi0923kuaishou;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/23 20:31
 * @describe:
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] jifen = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            jifen[i][0] = scanner.nextInt();
            jifen[i][1] = scanner.nextInt();
        }
        Arrays.sort(jifen, (int[] ints1, int[] ints2) -> {
            if (ints1[1] == ints2[1]) {
                return ints1[0] - ints2[0];
            }
            return ints1[1] - ints2[1];
        });
        int i1 = jifen[0][0];
        int res = 0;
        for (int i = 1; i < jifen.length; i++) {
            res = Math.max(res, i1 / jifen[i][1]);
            i1 *= jifen[i][0];
        }
        System.out.println(res);
    }
}
