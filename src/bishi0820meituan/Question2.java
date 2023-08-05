package bishi0820meituan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int position1X = scanner.nextInt();
        int position1Y = scanner.nextInt();
        int position2X = scanner.nextInt();
        int position2Y = scanner.nextInt();
        int position3X = scanner.nextInt();
        int position3Y = scanner.nextInt();
        int juli1 = scanner.nextInt();
        int juli2 = scanner.nextInt();
        int juli3 = scanner.nextInt();
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (Math.abs(i - position1X) + Math.abs(j - position1Y) == juli1) {
                    list1.add(i + " " + j);
                }
            }
        }
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (Math.abs(i - position2X) + Math.abs(j - position2Y) == juli2) {
                    list2.add(i + " " + j);
                }
            }
        }
        List<String> list3 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (Math.abs(i - position3X) + Math.abs(j - position3Y) == juli3) {
                    list3.add(i + " " + j);
                }
            }
        }
        list1.retainAll(list2);
        list1.retainAll(list3);
        System.out.println(list1.get(0));
    }
}
