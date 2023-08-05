package bishi0806weiruan;

import java.util.*;
class Solution2 {
    public int solution(String S) {
        // write your code in Java 8 (Java SE 8)
        int RCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)=='R'){
                RCount++;
            }
        }
        if(RCount==1||RCount==0){
            return 0;
        }
        int start = 0, end = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'R'){
                start = i;
                break;
            }
        }
        for (int i = S.length()-1; i >=0; i--) {
            if(S.charAt(i) == 'R'){
                end = i;
                break;
            }
        }
        String s = S.substring(start,end+1);
        int l = 0, r = s.length()-1;
        int lnum = 0, rnum = 0;
        long res = 0;
        while(l<=r){
            if(s.charAt(l) == 'R' && s.charAt(r) == 'R'){
                lnum++;
                rnum++;
                l++;
                r--;
            }else if(s.charAt(l) == 'R' && s.charAt(r) == 'W'){
                lnum++;
                l++;
            }else if(s.charAt(l) == 'W' && s.charAt(r) == 'R'){
                rnum++;
                r--;
            }else {
                if(lnum<=rnum){
                    res+=lnum;
                    l++;
                }else{
                    res+=rnum;
                    r--;
                }
            }
        }
        return res>1000000000?-1:(int)res;
    }
}

public class question2 {
}
