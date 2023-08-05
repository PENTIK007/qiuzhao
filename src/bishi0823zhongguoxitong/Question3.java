package bishi0823zhongguoxitong;

public class Question3 {
    static int res = 0;
    public static void main(String[] args) {
        int[][] matrx = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
        Question3 question3 = new Question3();
        int a = question3.longestIncreasingPath(matrx);
        System.out.println(a);
    }
    public int longestIncreasingPath (int[][] matrix) {
        // write code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[][] isValid = new int[matrix.length][matrix[0].length];

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[0].length; y++) {
                isValid[x][y] = 1;
                dfs(x, y, 1, matrix, isValid);
                isValid[x][y] = 0;
            }
        }
        return res;
    }
    public void dfs(int x, int y, int length, int[][] matrix, int[][] isValid) {
        res = Math.max(length, res);
        if (x - 1 >= 0 && matrix[x - 1][y] > matrix[x][y] &&isValid[x - 1][y] != 1) {
            isValid[x - 1][y] = 1;
            dfs(x - 1, y, length + 1, matrix, isValid);
            isValid[x - 1][y] = 0;
        }
        if (x + 1 <matrix.length && matrix[x + 1][y] > matrix[x][y] &&isValid[x + 1][y] != 1) {
            isValid[x + 1][y] = 1;
            dfs(x + 1, y, length + 1, matrix, isValid);
            isValid[x + 1][y] = 0;
        }
        if (y - 1 >= 0 && matrix[x][y - 1] > matrix[x][y] &&isValid[x][y - 1] != 1) {
            isValid[x][y - 1] = 1;
            dfs(x, y - 1, length + 1, matrix, isValid);
            isValid[x][y - 1] = 0;
        }
        if (y + 1 < matrix[0].length && matrix[x][y + 1] > matrix[x][y] &&isValid[x][y + 1] != 1) {
            isValid[x][y + 1] = 1;
            dfs(x, y + 1, length + 1, matrix, isValid);
            isValid[x][y + 1] = 0;
        }
    }
}
