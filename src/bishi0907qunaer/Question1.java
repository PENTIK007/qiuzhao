package bishi0907qunaer;

public class Question1 {
    public static void main(String[] args) {

    }
    static int score = 0;
    public int maxScore (int energy, int[][] actions) {
        // write code here
        int[] isValid = new int[actions.length];
        int tempScore = 0;
        dfs(energy, actions, isValid, tempScore);
        return score;
    }

    private void dfs(int energy, int[][] actions, int[] isValid, int tempScore) {
        for (int i = 0; i < actions.length; i++) {
            if (isValid[i] == 0 && energy - actions[i][0] >= 0) {
                energy -= actions[i][0];
                isValid[i] = 1;
                tempScore += actions[i][1];
                score = Math.max(score, tempScore);
                dfs(energy, actions, isValid, tempScore);
                energy += actions[i][0];
                isValid[i] = 0;
                tempScore -= actions[i][1];
            }
        }
    }
}
