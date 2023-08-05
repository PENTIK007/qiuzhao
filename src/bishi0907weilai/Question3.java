package bishi0907weilai;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                int a = temp % 10;
                if (a == x) {
                    res++;
                }
                temp = temp / 10;
            }
        }
        System.out.println(res);
    }
}
