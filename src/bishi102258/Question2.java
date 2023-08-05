package bishi102258;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/10/22 19:57
 * @describe:
 */
public class Question2 {
    static int res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            nums[i] = temp;
            sum += temp;
        }
        if (sum % 2 == 0) {
            dfs(nums, 0, sum, 0);
        }
        System.out.println(res);
    }

    private static void dfs(int[] nums, int currentSum, int sum, int i) {
        if (currentSum == sum / 2) {
            res = currentSum;
            return;
        }
        if (i >= nums.length) {
            return;
        }
        dfs(nums, currentSum + nums[i], sum, i + 1);
        dfs(nums, currentSum, sum, i + 1);
    }
}
