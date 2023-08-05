package bishi1022ximalaya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author: wwx
 * @date: 2022/10/22 21:05
 * @describe:
 */
public class Question2 {
    public ArrayList<String> Permutation (String str) {
        // write code here
        HashSet<String> res = new HashSet<>();
        String[] strs = str.split("");
        boolean[] isValid = new boolean[strs.length];
        LinkedList<String> temp = new LinkedList<>();
        dfs(strs, isValid, temp, res);
        return new ArrayList<>(res);
    }

    private void dfs(String[] strs, boolean[] isValid, LinkedList<String> temp, HashSet<String> res) {
        if (temp.size() == strs.length) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String s : temp) {
                stringBuilder.append(s);
            }
            res.add(new String(stringBuilder));
        }
        for (int i = 0; i < strs.length; i++) {
            if (isValid[i]) {
                continue;
            }
            temp.add(strs[i]);
            isValid[i] = true;
            dfs(strs, isValid, temp, res);
            temp.removeLast();
            isValid[i] = false;
        }
    }
}
