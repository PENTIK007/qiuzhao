package bishi0921tongcheng;

/**
 * @author: wwx
 * @date: 2022/9/21 20:14
 * @describe:
 */
public class Question2 {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
