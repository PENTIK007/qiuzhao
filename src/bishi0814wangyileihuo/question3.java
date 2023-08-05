package bishi0814wangyileihuo;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] shiwu = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                shiwu[i][j] = scanner.nextInt();
            }
        }
        int M = scanner.nextInt();
        int[][] ranshao = new int[M][3];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 3; j++) {
                ranshao[i][j] = scanner.nextInt();
            }
        }

    }
}
