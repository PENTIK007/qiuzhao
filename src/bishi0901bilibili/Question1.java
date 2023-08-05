package bishi0901bilibili;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Question1 {
    private static int res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n, 0);
        System.out.println(res);
    }

    private static void solution(int n, int sum) {
        if (n == 1) {
            res = Math.min(res, sum);
            return;
        }
        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0) {
                int newN = n / i;
                int newSum = sum + i;
                solution(newN, newSum);
            }
        }
    }
}
