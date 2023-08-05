package bishi0922yunzhanghu;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author: wwx
 * @date: 2022/9/22 21:42
 * @describe:
 */
public class Question2 {
    public String longestWord (String[] words) {
        // write code here
        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            return o2.compareTo(o1);
        });
        String res = "";
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("");
        for (String s : words) {
            hashSet.add(s);
            String temp = s.substring(0, s.length() - 1);
            if (hashSet.contains(temp) && s.length() > res.length()) {
                res = s;
            }
        }
        return res;
    }
}
