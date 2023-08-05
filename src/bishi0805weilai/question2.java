package bishi0805weilai;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        if (n > m) {
            stringBuilder.append("R");
            for (int i = 0; i < m; i++) {
                stringBuilder.append("P");
            }
            stringBuilder.append("R");
            for (int i = 0; i < n - m; i++) {
                stringBuilder.append("P");
            }
        } else {
            stringBuilder.append("P");
            for (int i = 0; i < n; i++) {
                stringBuilder.append("R");
            }
            stringBuilder.append("P");
            for (int i = 0; i < m - n; i++) {
                stringBuilder.append("R");
            }
        }
        System.out.println(stringBuilder);
    }
}
