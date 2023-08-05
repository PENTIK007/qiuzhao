package bishi0806kedaxunfei;

public class question1 {
    public static void main(String[] args) {
        System.out.println(findEwordCount("Nice to meet you"));
    }
    public static int findEwordCount (String string) {
        // write code here
        String[] strings = string.split(" ");
        int res = 0;
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
