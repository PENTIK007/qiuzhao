package bishi0924;

/**
 * @author: wwx
 * @date: 2022/9/24 20:15
 * @describe:
 */
public class Question2 {
    public static void main(String[] args) {
        System.out.println(assembleOrnaments(5,3,1));
    }

    public static int assembleOrnaments (int x, int y, int z) {
        // write code here
        int min = Math.min(x, y);
        int res = 0;
        if (z < min) {
            res += z;
            int max = Math.max(x - z, y - z);
            min = Math.min(x - z, y - z);
            if (max >= 2 * min) {
                res += min;
            } else {
                res += (max - min);
            }
        } else {
            res += min;
        }
        return res;
    }
}
