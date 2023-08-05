package bishi0916xiaomazhixing;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/16 21:07
 * @describe:
 */
public class Question2 {
    public static int res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] wanggge = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                wanggge[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfs(wanggge, i, j, 0);
            }
        }
        System.out.println(res);
    }

    private static void dfs(char[][] wangge, int i, int j, int count) {
        if (i < 0 || i >= wangge.length || j < 0 || j >= wangge[0].length || wangge[i][j] == '1') {
            res = Math.max(res, count);
            return;
        }
        char c = wangge[i][j];
        wangge[i][j] = '1';
        if (c == '^') {
            dfs(wangge, i - 1, j, count + 1);
        } else if (c == 'v') {
            dfs(wangge, i + 1, j, count + 1);
        } else if (c == '<') {
            dfs(wangge, i, j - 1, count + 1);
        } else if (c == '>') {
            dfs(wangge, i, j + 1, count + 1);
        }
        wangge[i][j] = c;
    }
}
