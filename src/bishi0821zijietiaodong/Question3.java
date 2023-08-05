package bishi0821zijietiaodong;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String tongpei = scanner.next();
        String[] titles = new String[n];
        for (int i = 0; i < n; i++) {
            titles[i] = scanner.next();
        }
        char[] tongpeiArray = tongpei.toCharArray();
        int count = 1;
        for (int i = 0; i < tongpeiArray.length; i++) {
            if (tongpeiArray[i] == '{') {
                count++;
            }
        }
        String[] split = new String[count];
        int start = 0;
        int end = 0;
        int index = 0;
        for (int i = 0; i < tongpeiArray.length; i++) {
            if (tongpeiArray[i] == '{') {
                end = i;
                split[index] = tongpei.substring(start, end);
                index ++;
            } else if (tongpeiArray[i] == '}') {
                start = i + 1;
            }
        }
        split[index] = tongpei.substring(start, tongpeiArray.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(split[i]);
            sb.append("*");
        }
        sb.delete(sb.length() - 1, sb.length());
        String p = sb.toString();
        for (int i = 0; i < n; i++) {
            String s = titles[i];
            if (isValid(s, p)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    private static boolean isValid(String s, String p) {
        boolean[][] value = new boolean[p.length() + 1][s.length() + 1];
        value[0][0] = true;
        for (int i = 1; i <= s.length(); i++) {
            value[0][i] = false;
        }
        for (int i = 1; i <= p.length(); i++) {
            if (p.charAt(i - 1) == '*') {
                value[i][0] = value[i - 1][0];
                for (int j = 1; j <= s.length(); j++) {
                    value[i][j] = (value[i][j - 1] || value[i - 1][j]);
                }
            } else {
                value[i][0] = false;
                for (int j = 1; j <= s.length(); j++) {
                    value[i][j] = s.charAt(j - 1) == p.charAt(i - 1) && value[i - 1][j - 1];
                }
            }
        }
        return value[p.length()][s.length()];
    }
}
