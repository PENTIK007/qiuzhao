package bishi0820wangyi;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i] == 'e') {
                if (chars[i - 1] == 'r') {
                    if (chars[i + 1] == 'd') {
                        continue;
                    } else {
                        res ++;
                    }
                } else if (chars[i - 1] == 'd') {
                    if (chars[i + 1] == 'e') {
                        i++;
                    } else {
                        res++;
                    }
                } else if (chars[i - 1] != 'r' && chars[i + 1] != 'd') {
                    res++;
                    if (chars[i + 1] != 'r' && chars[i + 1] != 'd') {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
