package bishi0830xiecheng;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int min = Math.min(a, b);
            min = Math.min(min, c);
            int res = min * 2;
            if (b - min >= 2) {
                res += b - min - 1;
            }
            System.out.println(res);
        }
    }
}
