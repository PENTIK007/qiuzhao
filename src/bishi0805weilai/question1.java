package bishi0805weilai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int k = scanner.nextInt();
        String[] numsString = s1.split(",");
        int[] nums = new int[numsString.length];
        for (int i = 0; i < numsString.length; i++) {
            nums[i] = Integer.parseInt(numsString[i]);
        }
        System.out.println(solution1(nums, k));
    }

    public static boolean solution1(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k != 0) {
            return false;
        }
        sum = sum / k;
        Arrays.sort(nums);
        if (nums[nums.length - 1] > sum) {
            return false;
        }
        int[] arr = new int[k];
        Arrays.fill(arr, sum);
        return solution2(nums, nums.length - 1, arr, k);
    }

    private static boolean solution2(int[] nums, int cur, int[] arr, int k) {
        if (cur < 0) {
            return true;
        }
        for (int i = 0; i < k; i++) {
            if (arr[i] == nums[cur] || (cur > 0 && arr[i] - nums[cur] >= nums[0])) {
                arr[i] -= nums[cur];
                if (solution2(nums, cur - 1, arr, k)) {
                    return true;
                }
                arr[i] += nums[cur];
            }
        }
        return false;
    }
}
