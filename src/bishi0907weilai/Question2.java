package bishi0907weilai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = str1.substring(1, str1.length() - 1);
        str2 = str2.substring(1, str2.length() - 1);
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (hashMap.containsKey(c1) && hashMap.get(c1) != c2) {
                System.out.println(-1);
                return;
            }
            hashMap.put(c1, c2);
        }
        int res = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != entry.getKey()) {
                res++;
            }
        }
        System.out.println(res);
    }
}
