package bishi0907tuhu;

public class Question1 {
    public static void main(String[] args) {

    }
    public int timeRequiredToBuyCounpons (int[] coupons, int m) {
        // write code here
        int res = 0;
        while (coupons[m] != 0) {
            for (int i = 0; i < coupons.length; i++) {
                if (coupons[i] > 0) {
                    coupons[i]--;
                    res += 10;
                }
                if (coupons[m] == 0) {
                    break;
                }
            }
        }
        return res;
    }
}
