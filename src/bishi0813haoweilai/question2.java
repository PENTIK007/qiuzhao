package bishi0813haoweilai;

import java.math.BigDecimal;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        scanner.nextLine();
        String[] sarray = s.split(",");
        int[] iarray = new int[sarray.length];
        for (int j = 0; j < sarray.length; j++) {
            iarray[j] = Integer.valueOf(sarray[j]);
        }
        int index = 0;
        while (index + i - 1 < iarray.length) {
            int j = index;
            int k = index + i - 1;
            while (j < k) {
                int temp = iarray[j];
                iarray[j] = iarray[k];
                iarray[k] = temp;
                j++;
                k--;
            }
            index = index + i;
        }
        for (int j = 0; j < iarray.length - 1; j++) {
            System.out.print(iarray[j]);
            System.out.print(',');
        }
        System.out.print(iarray[iarray.length - 1]);

    }
}
