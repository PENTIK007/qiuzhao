package bishi0820meituan;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question3_2 {
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
        PriorityQueue<Grade> priorityQueue = new PriorityQueue<>(new Comparator<Grade>() {
            @Override
            public int compare(Grade grade1, Grade grade2) {
                return Double.compare(grade2.fuxifenshu - grade2.bufuxifenshu, grade1.fuxifenshu - grade1.bufuxifenshu);
            }
        });
        for (int i = 0; i < n; i++) {
            priorityQueue.add(new Grade(a[i], a[i] * p[i] / 100.0));
        }
        double res = 0;
        for (int i = 0; i < n; i++) {
            if (i < m) {
                res += priorityQueue.poll().fuxifenshu;
            } else {
                res += priorityQueue.poll().bufuxifenshu;
            }
        }
        System.out.println(String.format("%.2f", res));
    }
}

class Grade {
    double fuxifenshu;
    double bufuxifenshu;

    Grade(double a, double b) {
        this.fuxifenshu = a;
        this.bufuxifenshu = b;
    }
}
