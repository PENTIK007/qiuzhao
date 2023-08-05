package bishi0904didi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    static int res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }
        int[] isValid = new int[n];
        LinkedList<Integer> list = new LinkedList<>();
        dfs(weight, isValid, list, k);
        System.out.println(res);
    }

    private static void dfs(int[] weight, int[] isValid, LinkedList<Integer> list, int k) {
        int sum = 0;
        int max = 0;
        for (Integer i : list) {
            sum += i;
            max = Math.max(max, i);
        }
        if (list.size() != 0) {
            if (max <= k * (sum / list.size())) {
                res = Math.max(list.size(), res);
            }
        }
        if (list.size() == weight.length) {
            return;
        }
        for (int i = 0; i < weight.length; i++) {
            if (isValid[i] == 1) {
                continue;
            }
            list.add(weight[i]);
            isValid[i] = 1;
            dfs(weight, isValid, list, k);
            list.removeLast();
            isValid[i] = 0;
        }
    }
}
