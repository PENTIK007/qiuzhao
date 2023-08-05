package bishi0921tongcheng;

/**
 * @author: wwx
 * @date: 2022/9/21 20:12
 * @describe:
 */
public class Question1 {
    public int maxSubArray (int[] nums) {
        // write code here
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
