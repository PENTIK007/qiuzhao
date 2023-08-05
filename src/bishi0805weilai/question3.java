package bishi0805weilai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        String target = scanner.nextLine();
        System.out.println(solution(source, target));
    }

    public static String solution(String source, String target) {
        Map<Character, Integer> tMap = new HashMap<>();
        //for (char c : target.toCharArray()) {
        //    if (tMap.containsKey(c)) {
        //        tMap.put(c, tMap.get(c));
        //    } else {
        //        tMap.put(c, 1);
        //    }
        //}
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c));
            } else {
                tMap.put(c, 1);
            }
        }
        //for (char c : source.toCharArray()) {
        //    if (target.indexOf(c) == -1) {
        //        tMap.put(c, 0);
        //    }
        //}
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (target.indexOf(c) == -1) {
                tMap.put(c, 0);
            }
        }
        int length = target.length();
        int start = 0;
        int end = 0;
        int head = 0;
        int tempCount = 0;
        int distance = Integer.MAX_VALUE;
        while (end < source.length()) {
            tempCount = tMap.get(source.charAt(end));
            if (tempCount > 0) {
                length--;
            }
            tMap.put(source.charAt(end), --tempCount);
            end++;
            while (length == 0) {
                if (end - start < distance) {
                    distance = end - start;
                    head = start;
                }
                tempCount = tMap.get(source.charAt(start));
                tMap.put(source.charAt(start), ++tempCount);
                if (tempCount > 0) {
                    length++;
                }
                start++;
            }
        }
        if (distance != Integer.MAX_VALUE) {
            return source.substring(head, head + distance);
        }
        return null;
    }
}
