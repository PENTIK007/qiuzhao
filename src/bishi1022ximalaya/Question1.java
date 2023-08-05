package bishi1022ximalaya;

/**
 * @author: wwx
 * @date: 2022/10/22 20:59
 * @describe:
 */
public class Question1 {
    public int[] temperatures (int[] dailyTemperatures) {
        // write code here
        int[] res = new int[dailyTemperatures.length];
        for (int i = 0; i < dailyTemperatures.length; i++) {
            int j = 1;
            while (i + j < dailyTemperatures.length) {
                if (dailyTemperatures[j] > dailyTemperatures[i]) {
                    res[i] = j;
                    break;
                }
                j++;
            }
        }
        return res;
    }
}
