package bishi0806meituan;

import java.util.Scanner;

public class question1 {
}
class Main1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int cakeAnums = scanner.nextInt();
            int cakeBnums = scanner.nextInt();
            System.out.println(solution(cakeAnums, cakeBnums));
        }
    }

    public static int solution(int cakeAnums, int cakeBnums) {
        int max = Math.max(cakeAnums, cakeBnums);
        int min = Math.min(cakeAnums, cakeBnums);
        int rest = 0;
        while (max - min < min) {
            min = min - 1;
            rest = rest + 1;
            if (max - min + rest >= min) break;
        }
        return min;
    }
}