package bishi0803yongyou;

import java.util.ArrayList;
import java.util.List;

public class question1 {
    public static void main(String[] args) {
    }
    public int[][] count (String str) {
        // write code here
        int[][] count = new int[10][1];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char character = str.charAt(i);
            if (character == '@') {
                count[1][0] += 1;
                continue;
            } else if (character == '!') {
                count[1][0] += 2;
                continue;
            } else if (character == '.') {
                count[1][0] += 3;
                continue;
            } else if (character == '/') {
                count[1][0] += 4;
                continue;
            }
            int number = character - 'a';
            if (number >= 0 && number <= 2) {
                count[2][0] += number + 1;
                continue;
            }
            if (number >= 3 && number <= 5) {
                count[3][0] += number - 2;
                continue;
            }
            if (number >= 6 && number <= 8) {
                count[4][0] += number - 5;
                continue;
            }
            if (number >= 9 && number <= 11) {
                count[5][0] += number - 8;
                continue;
            }
            if (number >= 12 && number <= 14) {
                count[6][0] += number - 11;
                continue;
            }
            if (number >= 15 && number <= 18) {
                count[7][0] += number - 14;
                continue;
            }
            if (number >= 19 && number <= 21) {
                count[8][0] += number - 18;
                continue;
            }
            if (number >= 22 && number <= 25) {
                count[8][0] += number - 18;
            }
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i][0] > 0) {
                sum++;
            }
        }
        int[][] res = new int[sum][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i][0] > 0) {
                res[index][0] = i;
                res[index][1] = count[i][0];
                index++;
            }
        }
        return res;
    }
}
