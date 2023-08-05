package bishi0919xunlei;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/19 20:27
 * @describe:
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split(" ");
        int[] ints = new int[split.length];
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            int temp = Integer.valueOf(split[i]);
            sum += temp;
            ints[i] = temp;
        }
        int a1 = 0;
        int a2 = 0;
        int a3 = sum;
        int res = 0;
        for (int i = 1; i < ints.length - 1; i++) {
            a1 += ints[i - 1];
            a2 = 0;
            a3 = sum - a1 - a2;
            for (int j = i; j < ints.length; j++) {

                a2 += ints[j];
                a3 -= ints[j];
                if (a1 < a2 && a2 < a3) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
