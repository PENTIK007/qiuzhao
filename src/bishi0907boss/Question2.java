package bishi0907boss;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int res = 0;
        while (x >= 10) {
            String s = String.valueOf(x);
            int temp = 1;
            for (int i = 0; i < s.length(); i++) {
                temp *= (Integer.valueOf(s.charAt(i)) - 48);
            }
            x = temp;
            res++;
        }
        System.out.println(res);
    }
}
