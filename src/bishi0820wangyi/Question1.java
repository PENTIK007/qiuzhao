package bishi0820wangyi;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        LinkedList<List<String>> list1 = new LinkedList<>();
        LinkedList<String> track1 = new LinkedList<>();
        LinkedList<List<String>> list2 = new LinkedList<>();
        LinkedList<String> track2 = new LinkedList<>();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        backTrack(chars1, 0, list1, track1);
        backTrack(chars2, 0, list2, track2);
        int minCount = Integer.MAX_VALUE;
        boolean hasResult = false;
        for (int i = 1; i < list1.size(); i++) {
            StringBuilder stringBuilder1 = new StringBuilder();
            for (String str : list1.get(i)) {
                stringBuilder1.append(str);
            }
            String s1 = stringBuilder1.toString();
            int i1 = Integer.parseInt(s1);
            for (int j = 1; j < list2.size(); j++) {
                StringBuilder stringBuilder2 = new StringBuilder();
                for (String str : list2.get(j)) {
                    stringBuilder2.append(str);
                }
                String s2 = stringBuilder2.toString();
                int i2 = Integer.parseInt(s2);
                if (isbeishu(i1, i2)) {
                    minCount = Math.min(minCount, str1.length() - s1.length() + str2.length() - s2.length());
                    hasResult = true;
                }
            }
        }
        if (hasResult) {
            System.out.println(minCount);
        } else {
            System.out.println(-1);
        }
    }

    public static void backTrack(char[] strs, int start, LinkedList<List<String>> list, LinkedList<String> track) {
        list.add(new LinkedList<>(track));
        for (int i = start; i < strs.length; i++) {
            track.addLast(String.valueOf(strs[i]));
            backTrack(strs, i + 1, list, track);
            track.removeLast();
        }
    }

    public static boolean isbeishu(int i1, int i2) {
        if (i1 % i2 == 0 || i2 % i1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
