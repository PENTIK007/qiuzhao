package bishi0923kuaishou;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/23 19:41
 * @describe:
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = temp ^ nums[i];
        }
        int index = temp & -temp;
        int a1 = 0, a2 = 0;
        for (int i = 0; i < n; i++) {
            if ((nums[i] & index) != 0) {
                a1 = a1 ^ nums[i];
            } else {
                a2 = a2 ^ nums[i];
            }
        }
        if (a1 < a2) {
            System.out.println(a1 + " " + a2);
        } else {
            System.out.println(a2 + " " + a1);
        }

    }
}
