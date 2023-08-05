package bishi0803yongyou;

public class question2 {
    public static void main(String[] args) {
        question2 q = new question2();
        //System.out.println(q.findBuilding());
    }
    public int[] findBuilding (int[] heights) {
        // write code here
        int[] res = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            res[i] = 1;
            int lefthight = 0;
            if (i - 1 > 0) {
                lefthight = heights[i - 1];
                res[i] += 1;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] > lefthight) {
                    res[i] += 1;
                    lefthight = heights[j];
                }
            }
            int rightheight = 0;
            if (i + 1 < heights.length) {
                rightheight = heights[i + 1];
                res[i] += 1;
            }
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > rightheight) {
                    res[i] += 1;
                    rightheight = heights[j];
                }
            }
        }
        return res;
    }
}
