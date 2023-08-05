package bishi0913weizhong;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        String[] ss = new String[3];
        ss[0] = String.valueOf(array[array.length - 1]);
        ss[1] = String.valueOf(array[array.length - 2]);
        ss[2] = String.valueOf(array[array.length - 3]);
        Arrays.sort(ss, (x1, x2) -> x2.compareTo(x1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            sb.append(ss[i]);
        }
        System.out.println(sb);
    }
}
