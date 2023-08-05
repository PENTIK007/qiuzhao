package bishi0820wangyi;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] bigCount = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        int res = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    for (int k = i + 1; k < j; k++) {
                        if (array[k] < array[i]) {
                            res ++;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
