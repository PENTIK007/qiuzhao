package bishi0915mayi;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int res = 0;
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }
            String[] split = s.split(" ");
            int a = Integer.valueOf(split[0]);
            int b = Integer.valueOf(split[1]);
            res += Math.abs(a - b);
        }
        System.out.println(res);
    }
}
