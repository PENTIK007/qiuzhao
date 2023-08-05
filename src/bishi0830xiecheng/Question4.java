package bishi0830xiecheng;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int max = 0;
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
            array2[i] = array1[i];
        }
        if (n == 2) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < n; i++) {
            if (Math.abs(array1[i] - array1[i - 1]) > max) {
                max = Math.abs(array1[i] - array1[i - 1]);
                maxIndex1 = i - 1;
                maxIndex2 = i;
            }
        }
        int res = Integer.MAX_VALUE;

        array1[maxIndex1] = array1[maxIndex2];
        max = 0;
        for (int i = 1; i < n; i++) {
            if (Math.abs(array1[i] - array1[i - 1]) > max) {
                max = Math.abs(array1[i] - array1[i - 1]);
            }
        }
        res = Math.min(res, max);
        array1[maxIndex1] = array2[maxIndex1];

        array1[maxIndex2] = array1[maxIndex1];
        max = 0;
        for (int i = 1; i < n; i++) {
            if (Math.abs(array1[i] - array1[i - 1]) > max) {
                max = Math.abs(array1[i] - array1[i - 1]);
            }
        }
        res = Math.min(res, max);
        array1[maxIndex2] = array2[maxIndex2];

        if (maxIndex1 != 0) {
            array1[maxIndex1] = (array1[maxIndex1 - 1] + array1[maxIndex1 + 1]) / 2;
            max = 0;
            for (int i = 1; i < n; i++) {
                if (Math.abs(array1[i] - array1[i - 1]) > max) {
                    max = Math.abs(array1[i] - array1[i - 1]);
                }
            }
            res = Math.min(res, max);
            array1[maxIndex1] = array2[maxIndex1];
        }

        if (maxIndex2 != array1.length - 1) {
            array1[maxIndex2] = (array1[maxIndex2 - 1] + array1[maxIndex2 + 1]) / 2;
            max = 0;
            for (int i = 1; i < n; i++) {
                if (Math.abs(array1[i] - array1[i - 1]) > max) {
                    max = Math.abs(array1[i] - array1[i - 1]);
                }
            }
            res = Math.min(res, max);
            array1[maxIndex2] = array2[maxIndex2];
        }
        System.out.println(res);
    }
}
