package bishi0827jindong;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();
        String left = string.substring(0, k);
        String right = string.substring(k, n);
        left = left.toUpperCase();
        right = right.toLowerCase();
        String res = left + right;
        System.out.println(res);
    }
}
