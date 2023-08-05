package bishi0828xiaohongshu;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int id = scanner.nextInt();
        int[][] zhongyaoxing = new int[n][2];
        for (int i = 0; i < n; i++) {
            int counts = 0;
            zhongyaoxing[i][0] = i + 1;
            for (int j = 0; j < m; j++) {
                int count = scanner.nextInt();
                counts += count;
            }
            zhongyaoxing[i][1] = counts;
        }
        Arrays.sort(zhongyaoxing, (int[] a1, int[] a2) ->{
            if (a1[1] < a2[1]) {
                return 1;
            }
            if (a1[1] == a2[1]) {
                return a1[0] - a2[0];
            }
            return -1;
        });
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (zhongyaoxing[i][0] == id) {
                res = i + 1;
            }
        }
        System.out.println(res);
    }
}
