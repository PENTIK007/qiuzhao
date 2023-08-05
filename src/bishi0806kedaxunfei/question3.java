package bishi0806kedaxunfei;

import java.util.Locale;
import java.util.Stack;

public class question3 {
    static int count;
    public static void main(String[] args) {
        System.out.println(findIflytek("iflytekiflytek"));
    }
    public static int findIflytek (String str) {
        // write code here
        str = str.toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder = new StringBuilder();
        backTrack(str, 0, 0, stringBuilder);
        return count;
    }
    public static void backTrack(String in, int strIndex, int iflytekIndx, StringBuilder stringBuilder) {
        if (stringBuilder.toString().equals("iflytek")) {
            count++;
            return;
        }
        if (iflytekIndx >= 7) {
            return;
        }
        for (int i = strIndex; i < in.length(); i++) {
            if (in.charAt(i) == "iflytek".charAt(iflytekIndx)) {
                stringBuilder.append(in.charAt(i));
                iflytekIndx++;
                backTrack(in, i + 1, iflytekIndx, stringBuilder);
                iflytekIndx--;
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
    }
}
