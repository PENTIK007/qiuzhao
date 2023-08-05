package bishi0906jidu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(new Question2().isEquals("aab","aac"));
    }
    public boolean isEquals (String str1, String str2) {
        // write code here
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars1 = str1.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            hashMap.put(chars1[i], hashMap.getOrDefault(chars1[i], 0) + 1);
        }
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            if (!hashMap.containsKey(chars2[i])) {
                return false;
            }
            hashMap.put(chars2[i], hashMap.get(chars2[i]) - 1);
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
