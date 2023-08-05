package bishi0926tonghuashun;

/**
 * @author: wwx
 * @date: 2022/9/26 16:04
 * @describe:
 */
public class NO7473ZiFuCuanFanZhuan {
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }
    private static String reverse(String str) {
        int length = str.length();
        //初始值判断
        if (length <= 1) {
            return str;
        }
        String left = str.substring(0, length / 2);
        String right = str.substring(length / 2, length);
        return reverse(right) + reverse(left);
    }
}
