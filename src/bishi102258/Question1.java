package bishi102258;

import java.util.*;

/**
 * @author: wwx
 * @date: 2022/10/22 19:36
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(",");
        boolean flag = true;
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if (flag) {
                if (!strings[i].equals("None")) {
                    sum += Integer.valueOf(strings[i]);
                }
            }
            a++;
            if (a == b) {
                b *= 3;
                a = 0;
                flag = !flag;
            }
        }
        System.out.println(sum);
    }
}
