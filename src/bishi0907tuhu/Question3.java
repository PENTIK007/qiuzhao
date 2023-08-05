package bishi0907tuhu;

public class Question3 {
    public static void main(String[] args) {
        int[][] costs = new int[][]{{4, 8, 6}, {6, 13, 8}};
        int res = new Question3().minVehiclePaintingCost(costs);
        System.out.println(res);
    }
    public int minVehiclePaintingCost (int[][] costs) {
        // write code here
        int[][] dp = new int[costs.length][costs[0].length];
        for (int i = 0; i < costs[0].length; i++) {
            dp[0][i] = costs[0][i];
        }
        for (int i = 1; i < costs.length; i++) {
            for (int j = 0; j < costs[0].length; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < costs[0].length; k++) {
                    if (k == j) {
                        continue;
                    }
                    min = Math.min(min, dp[i - 1][k]);
                }
                dp[i][j] = min + costs[i][j];
            }
        }
        int res = dp[dp.length - 1][0];
        for (int i : dp[dp.length - 1]) {
            res = Math.min(i, res);
        }
        return res;
    }
}
