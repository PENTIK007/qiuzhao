package bishi0831guanglianda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] guiding = new int[m][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                guiding[i][j] = scanner.nextInt();
            }
        }
        Arrays.sort(guiding, (a1, a2) ->{
            if (a1[0] != a2[0]) {
                return a1[0] - a2[0];
            } else if (a1[1] != a2[1]) {
                return a1[1] - a2[1];
            } else {
                return a1[2] - a2[2];
            }
        });
        int[] chair = new int[n];
        for (int i = 0; i < m; i++) {
            if (i == 0) {
                for (int j = 0; j < guiding[0][3]; j++) {
                    chair[j] = 1;
                }
            }
            if (i == m - 1) {
                for (int j = n - 1; j > n - guiding[m - 1][3]; j--) {
                    chair[j] = 1;
                }
            }
        }
    }
}
