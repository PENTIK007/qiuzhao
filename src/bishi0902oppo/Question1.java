package bishi0902oppo;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {

    }
    public int maxDigit (int[] digits) {
        // write code here
        Arrays.sort(digits);
        int sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = sum * 10 + digits[i];
        }
        return sum;
    }
}
