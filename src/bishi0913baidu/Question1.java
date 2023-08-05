package bishi0913baidu;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashSet<Character> isYuanyin = new HashSet<>();
        isYuanyin.add('a');
        isYuanyin.add('e');
        isYuanyin.add('i');
        isYuanyin.add('o');
        isYuanyin.add('u');

        int index = 0;
        int res = 0;
        while (index <= str.length() - 5) {
            if (isBaiDuString(str, index, isYuanyin)) {
                res++;
                index += 3;
            } else {
                index++;
            }
        }
        System.out.println(res);
    }

    private static boolean isBaiDuString(String str, int index, HashSet<Character> isYuanyin) {
        if (index > str.length() - 5) {
            return false;
        }
        char a1 = str.charAt(index);
        char a2 = str.charAt(index + 1);
        char a3 = str.charAt(index + 2);
        char a4 = str.charAt(index + 3);
        char a5 = str.charAt(index + 4);

        if (!isYuanyin.contains(a1) && !isYuanyin.contains(a4) && a1 != a4) {
            if (isYuanyin.contains(a2) && isYuanyin.contains(a3) && isYuanyin.contains(a5) && a2 != a3 && a2 != a5 && a3 != a5) {
                return true;
            }
        }
        return false;
    }
}
