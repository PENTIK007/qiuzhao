package bishi0806meituan;

import java.util.*;

public class question3 {
}
class Main3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int yiban = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] zhengmian = new int[n];
        int[] fanmian = new int[n];
        for (int i = 0; i < n; i++) {
            zhengmian[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            fanmian[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentMin = 0;
            int dangqiangzhi = zhengmian[i];
            int fan = 0;
            int bufan = 0;
            for (int j = 0; j < n; j++) {
                if (zhengmian[j] == dangqiangzhi) {
                    bufan++;
                } else if (fanmian[j] == dangqiangzhi) {
                    fan++;
                }
            }
            if (fan + bufan >= yiban) {
                currentMin = yiban - bufan;
                min = currentMin < min ? currentMin : min;
            }
        }
        for (int i = 0; i < n; i++) {
            int currentMin = 0;
            int dangqiangzhi = fanmian[i];
            int fan = 0;
            int bufan = 0;
            for (int j = 0; j < n; j++) {
                if (zhengmian[j] == dangqiangzhi) {
                    bufan++;
                } else if (fanmian[j] == dangqiangzhi) {
                    fan++;
                }
            }
            if (fan + bufan >= yiban) {
                currentMin = yiban - bufan;
                min = currentMin < min ? currentMin : min;
            }
        }
        System.out.println(min);
    }
}

