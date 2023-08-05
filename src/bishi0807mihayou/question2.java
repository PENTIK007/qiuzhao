package bishi0807mihayou;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0;
        int res = 0;
        int zuo = 0;
        int you = 0;
        while (i <= s.length() - 6) {
            String s5 = s.substring(i, i + 5);
            String s6 = s.substring(i, i + 6);
            if (s.substring(i, i + 5).equals("<div>")) {
                zuo++;
                i = i + 5;
                continue;
            } else if (s.substring(i, i + 6).equals("</div>")) {
                if (zuo > 0) {
                    zuo--;
                    res++;
                    i = i + 6;
                    continue;
                }
            }
            i++;
        }
        System.out.println(res);
    }
}
