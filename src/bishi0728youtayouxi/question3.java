package bishi0728youtayouxi;

import java.util.Scanner;

public class question3 {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int[] zhanli = new int[n];
        for (int i = 0; i < n; i++) {
            zhanli[i] = scanner.nextInt();
        }
        int[] yixuan = new int[5];
        digui(m, 0, 0, p, zhanli, yixuan);
        System.out.println(min);
    }

    public static void digui(int m, int yixuangeshu, int zongzhanli, int p, int[] zhanli, int[] yixuan) {
        if (yixuangeshu == m) {
            if (zongzhanli >= p && zongzhanli < min) {
                min = zongzhanli;
            }
            return;
        }
        for (int i = 0; i < zhanli.length; i++) {
            if (yixuan[i] == 0) {
                zongzhanli += zhanli[i];
                yixuangeshu++;
                yixuan[i] = 1;
            }
            digui(m, yixuangeshu, zongzhanli, p, zhanli, yixuan);
        }
    }
}
