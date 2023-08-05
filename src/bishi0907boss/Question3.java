package bishi0907boss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < n; i++) {
            if (score[i] < min) {
                min = score[i];
                minIndex = i;
            }
        }
        int[] left = new int[minIndex - 0];
        for (int i = 0; i < minIndex; i++) {
            left[i] = score[i];
        }
        int[] right = new int[n - minIndex - 1];
        for (int i = 0; i < n - minIndex - 1; i++) {
            right[i] = score[minIndex + i + 1];
        }
        Arrays.sort(left);
        Arrays.sort(right);
        int maxScore = score[minIndex];
        for (int i = 0; i < left.length; i++) {
            maxScore += (i + 2) * left[i];
        }
        for (int i = 0; i < right.length; i++) {
            maxScore += (i + 2) * right[i];
        }
        System.out.println(maxScore);
    }
}
