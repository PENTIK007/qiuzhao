package bishi0924;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wwx
 * @date: 2022/9/24 19:59
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        String[] strings = findMaxCommon("A new social, create your hip play show", "A new social, and create your hip show");
        for (String s : strings) {
            System.out.println(s);
        }
    }
    public static String[] findMaxCommon (String stringA, String stringB) {
        // write code here
        List<String> res = new ArrayList<>();
        for (int i = 0; i < stringA.length(); i++) {
            char c1 = stringA.charAt(i);
            StringBuilder stringBuilder = new StringBuilder();
            int index2 = 0;
            while (index2 < stringB.length() - 1 && stringB.charAt(index2) != c1) {
                index2++;
            }
            if (index2 < (stringB.length() - 1) && c1 == stringB.charAt(index2)) {
                stringBuilder.append(c1);
                int index1 = i;
                for (int j = i + 1; j < stringA.length(); j++) {
                    char char1 = stringA.charAt(j);
                    for (int k = index2 + 1; k < stringB.length(); k++) {
                        char char2 = stringB.charAt(k);
                        if (char1 == char2) {
                            index2 = k;
                            stringBuilder.append(char1);
                            break;
                        }
                    }
                }
            }
            res.add(stringBuilder.toString());
        }
        int maxLength = 0;
        for (String s : res) {
            maxLength = Math.max(maxLength, s.length());
        }
        List<String> temp = new ArrayList<>();
        for (String s : res) {
            if (s.length() == maxLength) {
                temp.add(s);
            }
        }
        String[] resString = new String[temp.size()];
        for (int i = 0; i < resString.length; i++) {
            resString[i] = temp.get(i);
        }
        return resString;
    }
}
