package bishi0813shenceshuju;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question3 {
    List<List<Integer>> res = new ArrayList<>();
    int minIndex = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] map = new char[]{'f', 'a', 'i', 'l', 'e', 'd'};
        int countF = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'f') {
                countF++;
                int indexD = new question3().getRes(str, i, map, 1);
                if (indexD != Integer.MAX_VALUE) {
                    int[] failedWord = new int[2];
                    failedWord[0] = i;
                    failedWord[1] = indexD;
                    list.add(failedWord);
                }
            }
        }
        int res = 1;
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            int[] pre = list.get(i);
            int[] next = list.get(i + 1);
            if (next[0] < pre[1]) {
                res++;
            } else {
                count = 1;
            }
            res = Math.max(res, count);
        }
        if (list.size() == 0) {
            res = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (cc != 'f' && cc != 'a' && cc != 'i' && cc != 'l' && cc != 'e' && cc != 'd') {
                res = -1;
            }
        }
        System.out.println(res);
    }

    private int getRes(String str, int indexOfS, char[] map, int indexOfMap) {
        dfs(str, indexOfS, map, indexOfMap);
        return minIndex;
    }

    private void dfs(String str, int indexOfS, char[] map, int indexOfMap) {
        if (indexOfMap > map.length - 1) {
            minIndex = Math.min((minIndex), indexOfS);
            return;
        }
        for (int i = indexOfS + 1; i < str.length(); i++) {
            if (str.charAt(i) == map[indexOfMap]) {
                dfs(str, i, map, indexOfMap + 1);
            }
        }
    }
}
