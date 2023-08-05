package bishi0820meituan;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Question3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        TreeMap<Double, Double> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            treeMap.put(a[i] - a[i] * p[i] / 100.0, a[i] * 1.0);
        }
        double sum = 0;
        Set<Double> doubles = treeMap.keySet();
        int i = 0;
        for (Double d : doubles) {
            if (i < n - m) {
                sum += treeMap.get(d) - d;
            } else {
                sum += treeMap.get(d);
            }
        }
        System.out.println(String.format("%.2f", sum));
    }
}
