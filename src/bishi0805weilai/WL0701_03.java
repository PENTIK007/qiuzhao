package bishi0805weilai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Zeta
 * @version 1.0
 * @date 2022-07-01 19:48
 */
public class WL0701_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        String maxName = "";
        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            int value = scanner.nextInt();
            if (value > max) {
                max = value;
                maxName = name;
            }
            map.put(name,value);
        }
        System.out.println(maxName);

    }
}
