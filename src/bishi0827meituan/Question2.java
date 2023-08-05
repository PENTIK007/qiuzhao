package bishi0827meituan;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = scanner.nextInt();
        }
        LinkedList<Integer> res = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = m - 1; i >= 0; i--) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                res.add(nums[i]);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
