package bishi0904didi;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[3][n];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int begin = array[0][i];
            int end = array[1][i];
            int meili = array[2][i];
            int count = 0;
            for (int j = begin; j <= end; j++) {
                if (yihuo(j) == meili) {
                    count ++;
                }
            }
            System.out.print(count + " ");
        }
    }

    private static int yihuo(int j) {
        String s = String.valueOf(j);
        //char[] chars = s.toCharArray();
        //int[] ints = new int[chars.length];
        //for (int i = 0; i < ints.length; i++) {
        //    ints[i] = chars[i] - 48;
        //}
        int res = s.charAt(0) - 48;
        for (int i = 1; i < s.length(); i++) {
            res = res ^ (s.charAt(i) - 48);
        }
        return res;
    }
}
