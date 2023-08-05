package bishi0820meituan;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String aString = scanner.nextLine();
        String bString = scanner.nextLine();
        String[] a = aString.split("");
        String[] b = bString.split("");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(a[i]);
            res.append(b[i]);
        }
        System.out.println(res);
    }
}
