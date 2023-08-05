package bishi0922xingye;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: wwx
 * @date: 2022/9/22 19:34
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        String[] dates = new String[]{"20th Oct 2051", "20th Oct 2051", "29th Feb 2004", "2nd Jan 2022"};
        int res = new Question1().dateArraysSum(dates);
        System.out.println(res);
    }
    public int dateArraysSum (String[] dates) {
        // write code here
        int[] days = new int[13];
        days[1] = 31;
        days[2] = days[1] + 28;
        days[3] = days[2] + 31;
        days[4] = days[3] + 30;
        days[5] = days[4] + 31;
        days[6] = days[5] + 30;
        days[7] = days[6] + 31;
        days[8] = days[7] + 31;
        days[9] = days[8] + 30;
        days[10] = days[9] + 31;
        days[11] = days[10] + 30;
        days[12] = days[11] + 31;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jan", 1);
        hashMap.put("Feb", 2);
        hashMap.put("Mar", 3);
        hashMap.put("Apr", 4);
        hashMap.put("May", 5);
        hashMap.put("Jun", 6);
        hashMap.put("Jul", 7);
        hashMap.put("Aug", 8);
        hashMap.put("Sep", 9);
        hashMap.put("Oct", 10);
        hashMap.put("Nov", 11);
        hashMap.put("Dec", 12);
        int res = 0;
        HashSet<String> hashSet = new HashSet<>();
        for (String s : dates) {
            hashSet.add(s);
        }
        for (String s : hashSet) {
            String[] split = s.split(" ");
            String dayString = split[0].substring(0, split[0].length() - 2);
            int dayInt = Integer.valueOf(dayString);
            res += dayInt;
            int math = hashMap.get(split[1]);
            //for (int j = 1; j < math; j++) {
            //    res += days[j];
            //}
            res += days[math - 1];
            int year = Integer.valueOf(split[2]);
            if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && math > 2) {
                res++;
            }
        }
        return res;
    }
}
