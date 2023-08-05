package bishi0926tonghuashun;

import java.util.Locale;

/**
 * @author: wwx
 * @date: 2022/9/26 15:55
 * @describe:
 */
public class NO2957ZiFuDaXiaoXie {
    public static void main(String[] args) {
        String str = "wel To";
        System.out.println(solution(str));
    }
    public static String solution(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Character temp = c;
            if (c >= 'a' && c <= 'z') {
                temp = Character.toUpperCase(c);
            } else if (c >= 'A' && c <= 'Z') {
                temp = Character.toLowerCase(c);
            }
            res.append(temp);
        }
        return res.toString();
    }
}
