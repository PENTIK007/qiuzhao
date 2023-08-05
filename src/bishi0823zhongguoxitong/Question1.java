package bishi0823zhongguoxitong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.substring(2, s.length());
        int n = Integer.parseInt(s);
        List<Integer> res = new ArrayList<>();
        int min = (int)Math.pow(10, n - 1);
        int max = ((int) Math.pow(10, n)) - 1;
        for (int i = min; i <= max; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int a = temp % 10;
                temp = temp / 10;
                sum += (int)Math.pow(a, n);
            }
            if (sum == i) {
                res.add(i);
            }
        }
        for (Integer i : res) {
            System.out.println(i);
        }
    }
}
