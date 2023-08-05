package bishi0821zijietiaodong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int zifucuan = scanner.nextInt();
            String s = String.valueOf(zifucuan);
            long res = 0;
            for (i = 0; i < s.length() - 1; i++) {
                long temp = Long.valueOf(s.substring(i, i + 2));
                res += temp;
            }
            list.add(res);
        }
        for (Long l : list) {
            System.out.println(l);
        }
    }
}
