package bishi0827jindong;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if (len < 6) {
            System.out.println(0);
            return;
        }
        int t = len - 6;
        double zuhe = Math.pow(3, t);
    }

    public static long jiecheng(int a) {
        long res = 0;
        for (int i = 0; i <= a; i++) {
            res += i;
        }
        return res;
    }
    public static long pow(int a, int b) {
        long res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        return res;
    }
}
