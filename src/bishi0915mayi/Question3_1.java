package bishi0915mayi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int res = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                int[] temp = new int[26];
                for (int k = i; k <= j; k++) {
                    char c = string.charAt(k);
                    temp[c - 97]++;
                }
                int count = 0;
                for (int k = 0; k < temp.length; k++) {
                    if (temp[k] % 2 != 0) {
                        count++;
                        if (count > 1) {
                            break;
                        }
                    }
                }
                if (count == 1) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
