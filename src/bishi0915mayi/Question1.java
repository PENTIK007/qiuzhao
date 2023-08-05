package bishi0915mayi;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            int count = (int)(Math.log(x) / Math.log(2));
            sb.append((char) ('a' + count));
            x = x - (int)Math.pow(2, count);
        }
        System.out.println(sb);
    }
}
