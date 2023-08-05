package bishi0907boss;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int di = divisor(max, min);
        System.out.println(a * b / di);
        //int temp = max;
        //while (true) {
        //    if (max % a == 0 && max % b == 0) {
        //        System.out.println(max);
        //        return;
        //    }
        //    max += temp;
        //}
    }

    public static int divisor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
        //if (a % b == 0) {
        //    return b;
        //} else {
        //    return divisor(b, a % b);
        //}
        //int temp;
        //while (b != 0) {
        //    temp = a % b;
        //    a = b;
        //    b = temp;
        //}
        //return a;
    }
}
