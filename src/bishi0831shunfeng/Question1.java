package bishi0831shunfeng;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        int[] array = new int[n + 1];
        array[0] = 1;
        int i = 0;
        while (Math.pow(2, i) <= n) {
            if (Math.pow(2, i + 1) <=n) {
                res += (i + 1) * (Math.pow(2, i + 1) - Math.pow(2, i));
            } else {
                res += (i + 1) * (n - Math.pow(2, i) + 1);
            }
            i++;
        }
        System.out.println(res);
    }
}
