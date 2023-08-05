package bishi0914tianyiyun;

import java.util.Scanner;

public class Question1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[1000001];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] strings = s.split(",");
            int begin = Integer.valueOf(strings[0]);
            int end = Integer.valueOf(strings[1]);
            array[begin] += 1;
            array[end] -= 1;
        }
        int res = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
            if (array[i] == 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
