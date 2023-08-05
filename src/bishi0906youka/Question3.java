package bishi0906youka;

public class Question3 {
    static StringBuilder res = new StringBuilder();
    public static void main(String[] args) {
        System.out.println(new Question3().removeDuplicates("deeedbbcccbdaa",3));
    }


    public String removeDuplicates (String s, int k) {
        // write code here
        solution(s, k);
        return res.toString();
    }

    private void solution(String s, int k) {
        boolean flag = true;
        int left = 0;
        int right = 1;
        char[] chars = s.toCharArray();
        while (right < chars.length) {
            while (right < chars.length && chars[left] != chars[right]) {
                left++;
                right++;
            }
            while (right < chars.length && chars[left] == chars[right]) {
                right++;
            }
            if (right - left >= k) {
                flag = false;
                for (int i = left; i < right; i++) {
                    chars[i] = ' ';
                }
            }
            left = right;
            right++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (c != ' ') {
                stringBuilder.append(c);
            }
        }
        s = stringBuilder.toString();
        res = stringBuilder;
        if (flag) {
            return;
        }
        solution(s, k);
    }
}
