package bishi0827360;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.nextLine();
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        String[] s11 = s1.split(" ");
        String[] s22 = s2.split(" ");
        String[] s33 = s3.split(" ");
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        for (String s : s11) {
            set1.add(s);
        }
        for (String s : s22) {
            set2.add(s);
        }
        for (String s : s33) {
            set3.add(s);
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String ss = scanner.nextLine();
            String[] strings = ss.split(" ");
            int flag = 1;
            boolean isok = true;
            boolean has1 = false;
            boolean has2 = false;
            int has22 = 0;
            for (int j = 0; j < strings.length; j++) {
                if (set1.contains(strings[j]) && flag == 1) {
                    has1 = true;
                    continue;
                } else if (set2.contains(strings[j]) && (flag == 1 || flag == 2) && has1) {
                    has22++;
                    has2 = true;
                    flag = 2;
                    continue;
                } else if (set3.contains(strings[j]) && (flag == 2 || flag == 3) && has22 == 1) {
                    flag = 3;
                    continue;
                }
                isok = false;
            }
            if (flag == 3 && isok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
