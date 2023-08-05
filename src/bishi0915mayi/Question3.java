package bishi0915mayi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] ints = new int[26];
        ints[string.charAt(0) - 97]++;
        arrayList.add(ints);
        for (int i = 1; i < string.length(); i++) {
            int[] temp = Arrays.copyOf(arrayList.get(i - 1), 26);
            temp[string.charAt(i) - 97]++;
            arrayList.add(temp);
        }
        int res = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                int count = 0;
                if (i == 0) {
                    int[] end = arrayList.get(j);
                    for (int k = 0; k < end.length; k++) {
                        if (end[k] % 2 != 0) {
                            count++;
                            if (count > 1) {
                                break;
                            }
                        }
                    }
                }else{
                    int[] begin = arrayList.get(i - 1);
                    int[] end = arrayList.get(j);
                    for (int k = 0; k < end.length; k++) {
                        int temp = end[k] - begin[k];
                        if (temp % 2 != 0) {
                            count++;
                            if (count > 1) {
                                break;
                            }
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
