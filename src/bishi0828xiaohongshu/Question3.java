package bishi0828xiaohongshu;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Question3 {
    static int resmax = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] guanxi = new int[n - 1][2];
        for (int i = 0; i < n - 1; i++) {
            int id = scanner.nextInt();
            guanxi[i][0] = id;
            guanxi[i][1] = i + 2;
        }
        HashSet<Integer> isContain = new HashSet<>();
        int[] isvalid = new int[n - 1];
        solution(guanxi, isContain, isvalid, 0, 0);
        System.out.println(resmax);
    }

    public static void solution(int[][] guanxi, HashSet<Integer> isContain, int[] isvalid, int max, int length) {
        if (max > resmax) {
            resmax = max;
        }
        if (length == guanxi.length) {
            return;
        }
        for (int i = 0; i < guanxi.length; i++) {
            length++;
            if (isvalid[i] == 0 && !isContain.contains(guanxi[i][0]) && !isContain.contains(guanxi[i][1])) {
                isvalid[i] = 1;
                isContain.add(guanxi[i][0]);
                isContain.add(guanxi[i][1]);
                max++;
                solution(guanxi, isContain, isvalid, max, length);
                isvalid[i] = 0;
                isContain.remove(guanxi[i][0]);
                isContain.remove(guanxi[i][1]);
                max--;
            }
            length--;
        }
    }
}
