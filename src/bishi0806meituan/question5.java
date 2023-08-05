package bishi0806meituan;
import java.util.*;

class Main5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        char[] chars1 = new char[t];
        char[] chars2 = {'w', 'o', 'w', 'M', 'e', 'i', 'T', 'u', 'a', 'n', 'n', 'a', 'u', 'T', 'i', 'e', 'M', 'w', 'o', 'w'};
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            k = k +  3;
            k = k % 20;
            if (k == 0) {
                k = 20;
            }
            k--;
            chars1[i] = chars2[k];
            scanner.nextLine();
        }
        for (int i = 0; i < chars1.length; i++) {
            System.out.println(chars1[i]);
        }
    }
}
public class question5 {
}
