package bishi0926tonghuashun;

/**
 * @author: wwx
 * @date: 2022/9/26 15:50
 * @describe:
 */
public class NO7489ZiFuGeShu {
    public static int solution(String str, char c){
        int res = 0;
        c = Character.toLowerCase(c);
        for (int i = 0; i < str.length(); i++) {
            char temp = Character.toLowerCase(str.charAt(i));
            if (c == temp) {
                res++;
            }
        }
        return res;
    }
}
