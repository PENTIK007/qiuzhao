package bishi0830xiecheng;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int res = solution(x);
            System.out.println(res);
        }
    }

    private static int solution(int x) {
        if (x % 2 == 0) {
            return x;
        }
        String temp = String.valueOf(x);
        int[] res = new int[temp.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = temp.charAt(i) - 48;
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] % 2 == 0) {
                int tempNum = res[i];
                res[i] = res[res.length - 1];
                res[res.length - 1] = tempNum;
                break;
            }
            if (i == res.length - 1) {
                return -1;
            }
        }
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i] * Math.pow(10, res.length - i - 1);
        }
        return sum;
    }
}
