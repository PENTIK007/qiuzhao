package bishi0903dada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split(",");
        int start = Integer.valueOf(strings[0]);
        int end = Integer.valueOf(strings[1]);
        List<Integer> res = new ArrayList<>();
        if (start < 10) {
            start = 11;
        }
        for (int i = start; i <= end; i++) {
            String iString = String.valueOf(i);
            StringBuilder qian = null;
            StringBuilder hou = null;
            if (iString.length() % 2 == 0) {
                qian = new StringBuilder(iString.substring(0, iString.length() / 2));
                hou = new StringBuilder(iString.substring(iString.length() / 2 ));
            } else {
                qian = new StringBuilder(iString.substring(0, iString.length() / 2));
                hou = new StringBuilder(iString.substring(iString.length() / 2 + 1));
            }
            String qianString = new String(qian);
            String houString = new String(hou.reverse());
            if (qianString.equals(houString)) {
                res.add(i);
            }
        }
        for (int i = 0; i < res.size() - 1; i++) {
            System.out.print(res.get(i) + ",");
        }
        System.out.print(res.get(res.size() - 1));
    }
}
