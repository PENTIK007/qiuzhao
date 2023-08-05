package bishi0825qianxin;


import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.substring(1, string.length() - 1);
        String[] strings = string.split(",");
        int[] y = new int[strings.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = Integer.valueOf(strings[i]);
        }
        int max = 0;
        for (int i = 0; i < y.length; i++) {
            for (int j = i + 1; j < y.length; j++) {
                int temp = Math.abs(i - j) * Math.min(y[i], y[j]);
                max = Math.max(max, temp);
            }
        }
        System.out.println(max);
    }
}
