package bishi0908tengxunyinyue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Queston1_1 {
    public static void main(String[] args) {

    }
    public int minOperations (String str) {
        // write code here
        int[] counts = new int[26];
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            counts[c - 'a']++;
        }
        int res = 0;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < 26; i++) {
                if (counts[i] >= 2) {
                    counts[i] -= 2;
                    flag = true;
                    res++;
                    int minIndex = 0;
                    int minCount = Integer.MAX_VALUE;
                    for (int j = 0; j < 26; j++) {
                        if (counts[j] < minCount) {
                            minIndex = j;
                            minCount = counts[j];
                        }
                    }
                    counts[minIndex]++;
                }
            }
        }
        return res;
    }
}
