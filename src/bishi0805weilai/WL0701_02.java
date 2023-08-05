package bishi0805weilai;

import java.util.Scanner;

/**
 * @author Zeta
 * @version 1.0
 * @date 2022-07-01 18:50
 */
public class WL0701_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String num = scanner.nextLine();
//        int N = num.charAt(0) - '0';
//        int K = num.charAt(2) - '0';
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        StringBuilder sb = new StringBuilder(S);
        for (int i = 1; i <= N - K + 1; i++) {
            reverse(sb, i - 1, i + K - 2);
        }
        System.out.println(sb.toString());
    }

    // 反转子串方法
    public static void reverse(StringBuilder sb, int begin, int end) {
        // 子串
        String subS = sb.substring(begin, end + 1);
        // 反转后子串
        String reverseSb = new StringBuilder(subS).reverse().toString();
        // 反转后子串赋值
        for (int i = begin; i <= end; i++) {
            sb.setCharAt(i, reverseSb.charAt(i - begin));
        }
    }
}
