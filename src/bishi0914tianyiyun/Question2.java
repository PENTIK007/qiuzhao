package bishi0914tianyiyun;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();
        String[] split = string.split(",");
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for (String s : split) {
            int temp = Integer.valueOf(s);
            if (temp % 2 == 0) {
                a1.add(temp);
            } else {
                a2.add(temp);
            }
        }
        a1.addAll(a2);
        for (int i = 0; i < a1.size() - 1; i++) {
            System.out.print(a1.get(i) + ",");
        }
        System.out.println(a1.get(a1.size() - 1));
    }
}
