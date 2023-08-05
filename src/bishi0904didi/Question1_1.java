package bishi0904didi;

import java.util.Arrays;
import java.util.Scanner;

public class Question1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] weights = new int[n];
        int sumWeight = 0;
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            sumWeight += weights[i];
        }
        Arrays.sort(weights);
        int maxRes1 = 0;
        int maxRes2 = 0;
        for (int i = n; i >= 0; i--) {
            int standard = (sumWeight / i) * k;
            if (weights[i - 1] > standard) {
                sumWeight -= weights[i - 1];
            } else {
                maxRes1 = i;
                break;
            }
        }
        int frontIndex = 0;
        for (int i = n; i >= 0; i--) {
            int standard = (sumWeight / i) * k;
            if (weights[i - 1] > standard && frontIndex < weights.length) {
                sumWeight -= weights[frontIndex++];
            } else {
                maxRes2 = i;
                break;
            }
        }
        System.out.println(Math.max(maxRes1, maxRes2));
    }
}
