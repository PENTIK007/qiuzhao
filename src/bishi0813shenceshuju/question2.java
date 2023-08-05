package bishi0813shenceshuju;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String[] timeArray = s.split(" ");
        Arrays.sort(timeArray);
        //for (String s1 : timeArray) {
        //    System.out.println(s1);
        //}
        String res = null;
        int minjiange = Integer.MAX_VALUE;
        for (int i = 0; i < timeArray.length; i++) {
            String[] time1 = timeArray[i].split(":");
            String[] time2 = null;
            if (i == timeArray.length - 1) {
                time2 = timeArray[0].split(":");
                time2[0] = String.valueOf(24 + Integer.valueOf(time2[0]));
            } else {
                time2 = timeArray[i + 1].split(":");
            }
            int jiange = solution(time1, time2);
            if (jiange < minjiange) {
                res = timeArray[i];
                minjiange = jiange;
            }
        }
        System.out.println(res);
    }



    private static int solution(String[] time1, String[] time2) {
        int[] t1 = new int[3];
        int[] t2 = new int[3];

        for (int i = 0; i < 3; i++) {
            t1[i] = Integer.valueOf(time1[i]);
            t2[i] = Integer.valueOf(time2[i]);
        }
        int tt1 = t1[0] * 60 * 60 + t1[1] * 60 + t1[2];
        int tt2 = t2[0] * 60 * 60 + t2[1] * 60 + t2[2];
        return tt2 - tt1;
    }
}
