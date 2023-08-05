package bishi0914tianyiyun;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[1000000];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] strings = s.split(",");
            int begin = Integer.valueOf(strings[0]);
            int end = Integer.valueOf(strings[1]);
            for (int j = begin; j < end; j++) {
                array[j]++;
            }
        }
        int res = 0;
        for (int i : array) {
            if (i == 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
