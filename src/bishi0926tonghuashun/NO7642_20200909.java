package bishi0926tonghuashun;

/**
 * @author: wwx
 * @date: 2022/9/26 16:55
 * @describe:
 */
public class NO7642_20200909 {
    public static void main(String[] args) {
        int num = 20200909;
        System.out.println(solution(num));
    }
    public static String solution(int num) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        while (num > 0) {
            int yushu = num % 10;
            count++;
            res.append(String.valueOf(yushu));
            if (count == 3) {
                res.append(",");
                count = 0;
            }
            num /= 10;
        }
        return res.reverse().toString();
    }
}
