package bishi0922yunzhanghu;

import java.util.ArrayList;

/**
 * @author: wwx
 * @date: 2022/9/22 21:30
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        boolean res = new Question1().isPalindrome(123);
        System.out.println(res);
    }
    public boolean isPalindrome (int x) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        while (x > 0) {
            int temp = x % 10;
            list.add(temp);
            x /= 10;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            int left = list.get(i);
            int right = list.get(list.size() - 1 - i);
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}
