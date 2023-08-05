package bishi0919xunlei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/19 20:17
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            ArrayList<String> arrayList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arrayList.add(scanner.nextLine());
            }
            Collections.sort(arrayList);
            //System.out.println(arrayList);
            boolean flag = true;
            for (int j = 0; j < n - 1; j++) {
                String temp1 = arrayList.get(j);
                String temp2 = arrayList.get(j + 1);
                if (temp2.length() > temp1.length() && temp1.equals(temp2.substring(0, temp1.length()))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
