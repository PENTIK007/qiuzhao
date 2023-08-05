package bishi0908tengxunyinyue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        Question1 question1 = new Question1();
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
        int size = hashMap.size();
        Set<Character> characters = hashMap.keySet();
        for (Character c : characters) {
            if (size == 26) {
                break;
            }
            if (hashMap.get(c) == 1) {
                continue;
            } else if (hashMap.get(c) == 2) {
                hashMap.put(c, hashMap.get(c) - 1);
                res++;
            } else {
                while (size != 26 && hashMap.get(c) != 1) {
                    size++;
                    hashMap.put(c, hashMap.get(c) - 2);
                    res++;
                }
            }
        }
        characters = hashMap.keySet();
        for (Character c : characters) {
            if (hashMap.get(c) >= 2) {
                res += (hashMap.get(c) - 1);
            }
        }
        return res;
    }
}
