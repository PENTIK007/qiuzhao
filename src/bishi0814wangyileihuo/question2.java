package bishi0814wangyileihuo;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[m];
        for (int i = 0; i < m; i++) {
            strings[i] = scanner.nextLine();
        }
        Map<String, String> map = new HashMap<>();
        map.put("#R", "FF0000");
        map.put("#G", "00C932");
        map.put("#B", "0000FF");
        map.put("#K", "000000");
        map.put("#Y", "FFFF00");
        map.put("#W", "FFFFFF");
        map.put("#P", "FF88FF");
        map.put("#C", "XXXXXX");
        for (String string : strings) {
            List<String> res = new ArrayList<>();
            Stack<String> stack = new Stack<>();
            int begin = 0;
            int i = 0;
            while (i + 1 < string.length()) {
                if (map.containsKey(string.substring(i, i + 2))) {
                    if (string.substring(i, i + 2).equals("#C")) {
                        if (i + 7 < string.length()) {
                            if (isValid(string.substring(i + 2, i + 8))) {
                                if (!stack.isEmpty() && i != begin) {
                                    String resString = string.substring(begin, i) + " " + stack.peek();
                                    res.add(resString);
                                }
                                stack.push(string.substring(i + 2, i + 8));
                                begin = i + 8;
                                i = begin;
                                continue;
                            }
                        }
                    } else {
                        if (!stack.isEmpty() && i != begin) {
                            String resString = string.substring(begin, i) + " " + stack.peek();
                            res.add(resString);
                        }
                        stack.push(map.get(string.substring(i, i + 2)));
                        begin = i + 2;
                        i = begin;
                        continue;
                    }
                } else if (string.substring(i, i + 2).equals("#n")) {
                    if (!stack.isEmpty() && i != begin) {
                        String resString = string.substring(begin, i) + " " + stack.pop();
                        res.add(resString);
                        begin = i + 2;
                        i = begin;
                        continue;
                    }
                }
                i++;
            }
            if (!stack.isEmpty()) {
                String resString = string.substring(begin, string.length()) + " " + stack.pop();
                res.add(resString);
            }
            if (res.isEmpty()) {
                System.out.println("empty");
                continue;
            }
            for (String s : res) {
                System.out.println(s);
            }
        }
    }

    public static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }
}
