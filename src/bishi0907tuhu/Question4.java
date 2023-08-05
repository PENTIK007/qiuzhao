package bishi0907tuhu;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = scanner.nextInt();
        }
        int firstBuy = -price[0];
        int firstSell = 0;
        int secondBuy = -price[0];
        int secondSell = 0;
        for (int i = 0; i < n; i++) {
            firstBuy = Math.max(firstBuy, -price[i]);
            firstSell = Math.max(firstSell, firstBuy + price[i]);
            secondBuy = Math.max(secondBuy, firstSell - price[i]);
            secondSell = Math.max(secondSell, secondBuy + price[i]);
        }
        System.out.println(secondSell);
    }
}
