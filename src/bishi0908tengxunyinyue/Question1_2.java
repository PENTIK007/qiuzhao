package bishi0908tengxunyinyue;

import java.util.HashMap;
import java.util.Set;

public class Question1_2 {
    public static void main(String[] args) {
        Question1_2 question1 = new Question1_2();
        int res = question1.minOperations("aaabbbbcdefghijklmnopqrstuvwx");
        System.out.println(res);
    }
    public int minOperations (String str) {
        // write code here
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            hashMap.put(chars[i], hashMap.getOrDefault(chars[i], 0) + 1);
        }
        int res = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            Set<Character> characters = hashMap.keySet();
            for (Character c : characters) {
                if (hashMap.get(c) >= 2) {
                    flag = true;
                    hashMap.put(c, hashMap.get(c) - 2);
                    res++;
                    Character minC = ' ';
                    int minCount = Integer.MAX_VALUE;
                    Set<Character> charactersTemp = hashMap.keySet();
                    for (Character cc : charactersTemp) {
                        if (hashMap.get(cc) < Integer.MAX_VALUE) {
                            minC = cc;
                            minCount = hashMap.get(cc);
                        }
                    }
                    hashMap.put(minC, hashMap.get(minC) + 1);
                }
            }
        }
        return res;
    }
}
