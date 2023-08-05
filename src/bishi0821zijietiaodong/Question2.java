package bishi0821zijietiaodong;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] migong = new char[n][m];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            migong[i] = s.toCharArray();
        }
        int res = 0;
        int[][] isSuccess = new int[n][m];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                char[][] isValid = new char[n][m];
                boolean temp = dfs(x, y, migong, isValid, isSuccess);
                if (!temp) {
                    isSuccess[x][y] = -1;
                    res++;
                } else {
                    isSuccess[x][y] = 1;
                }
            }
        }
        System.out.println(res);
    }

    private static boolean dfs(int x, int y, char[][] migong, char[][] isValid, int[][] isSuccess) {
        if (x < 0 || x >= migong.length || y < 0 || y >= migong[0].length || isValid[x][y] == 1) {
            return false;
        }
        if (isSuccess[x][y] == -1) {
            return false;
        } else if (isSuccess[x][y] == 1) {
            return true;
        }
        isValid[x][y] = 1;
        if (migong[x][y] == 'O') {
            return true;
        } else if (migong[x][y] == '.') {
            return dfs(x - 1, y , migong, isValid, isSuccess)
                    || dfs(x + 1, y, migong, isValid, isSuccess)
                    || dfs( x, y + 1,  migong, isValid, isSuccess)
                    || dfs(x, y - 1, migong, isValid, isSuccess);
        } else if (migong[x][y] == 'U') {
            return dfs(x - 1, y, migong, isValid, isSuccess);
        } else if (migong[x][y] == 'D') {
            return dfs(x + 1, y, migong, isValid, isSuccess);
        } else if (migong[x][y] == 'L') {
            return dfs(x, y - 1, migong, isValid, isSuccess);
        } else {
            return dfs(x, y + 1, migong, isValid, isSuccess);
        }
    }
}
