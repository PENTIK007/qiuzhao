package bishi0830xiecheng;

import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String colors = scanner.nextLine();
        int[][] tree = new int[n - 1][2];
        for (int i = 0; i < n - 1; i++) {
            tree[i][0] = scanner.nextInt();
            tree[i][1] = scanner.nextInt();
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> hashSet1 = new HashSet<>();
            HashSet<Integer> hashSet2 = new HashSet<>();

            if (i != n - 2) {
                hashSet1.add(tree[i + 1][0]);
                hashSet1.add(tree[i + 1][1]);
            } else {
                hashSet1.add(tree[i - 1][0]);
                hashSet1.add(tree[i - 1][1]);
            }
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n - 1; k++) {
                    if (k == i) {
                        continue;
                    }
                    if (hashSet1.contains(tree[k][0]) || hashSet1.contains(tree[k][1])) {
                        hashSet1.add(tree[k][0]);
                        hashSet1.add(tree[k][1]);
                    }
                }
            }
            for (int j = 0; j < n - 1; j++) {
                if (!hashSet1.contains(tree[j][0]) && !hashSet1.contains(tree[j][1])) {
                    hashSet2.add(tree[j][0]);
                    hashSet2.add(tree[j][1]);
                }
            }
            HashSet<Character> colorSet1 = new HashSet<>();
            HashSet<Character> colorSet2 = new HashSet<>();
            for (Integer integer : hashSet1) {
                colorSet1.add(colors.charAt(integer - 1));
            }
            for (Integer integer : hashSet2) {
                colorSet2.add(colors.charAt(integer - 1));
            }
            if (colorSet1.size() == 3 && colorSet2.size() == 3) {
                res++;
            }
        }
        System.out.println(res);
    }
}
