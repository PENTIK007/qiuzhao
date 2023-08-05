package bishi0919xunlei;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/19 20:42
 * @describe:
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split(",");
        int target = Integer.valueOf(split[0]);
        int maxDouble = Integer.valueOf(split[1]);
        int res = 0;
        if (target % 2 != 0) {
            target--;
            res++;
        }
        while (target > 1 && maxDouble > 0) {
            target /= 2;
            maxDouble--;
            res++;
        }
        System.out.println(res + (target - 1));
    }
}
