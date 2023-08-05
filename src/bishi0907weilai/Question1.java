package bishi0907weilai;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int nums = scanner.nextInt();
        //char[] chars = s.toCharArray();
        int[] stations = new int[ss.length];
        int max = 0;
        for (int i = 0; i < ss.length; i++) {
            int temp = Integer.valueOf(ss[i]);
            max = Math.max(temp, max);
            stations[i] = temp;
        }
        ArrayList<String> res = new ArrayList<>();
        for (int i : stations) {
            if (i + nums < max) {
                res.add("False");
            } else {
                res.add("True");
            }
        }
        System.out.println(res);
    }
}
