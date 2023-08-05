package bishi0916xiaomazhixing;

import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/9/16 20:43
 * @describe:
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        char[] charArray = s.toCharArray();
        int res = 0;
        p:
        for (int i = 0; i < n - 3; i++) {
            if (charArray[i] == 'p') {
                o:
                for (int j = i + 1; j < n - 2; j++) {
                    if (charArray[j] == 'o') {
                        for (int k = j + 1; k < n - 1; k++) {
                            if (charArray[k] == 'n') {
                                for (int l = k + 1; l < n; l++) {
                                    if (charArray[l] == 'y') {
                                        res++;
                                        charArray[i] = 'a';
                                        charArray[j] = 'a';
                                        charArray[k] = 'a';
                                        charArray[l] = 'a';
                                        continue p;
                                    } else if (l == n - 1) {
                                        break p;
                                    }
                                }
                            } else if (k == n - 2) {
                                break p;
                            }
                        }
                    } else if (j == n - 3) {
                        break p;
                    }
                }
            } else if (i == n - 4) {
                break p;
            }
        }
        System.out.println(res);
    }
}
