package bishi0806weiruan;
import java.util.*;
class Solution {
    public int solution(String S, int B) {
        // write your code in Java 11 (Java SE 11)
        int N = S.length();
        List<Integer> count = new ArrayList<>();
        int req = 0;
        for (int i = 0; i < N; i++) {
            if(i ==0 && S.charAt(i) == 'x'){
                req++;
                if(i == N-1){
                    count.add(req);
                }
            }else if(i > 0 && S.charAt(i)=='x' && S.charAt(i-1) == 'x'){
                req++;
                if(i == N-1){
                    count.add(req);
                }
            }else if(i > 0 && S.charAt(i)=='x' && S.charAt(i-1) != 'x'){
                req++;
                if(i == N-1){
                    count.add(req);
                }
            }else {
                if(req != 0)count.add(req);
                req = 0;
            }
        }
        if(count.size() == 0){
            return 0;
        }
        Collections.sort(count);
        int res = 0;
        for (int i = count.size()-1; i >=0; i--) {
            if(count.get(i) >= B){
                return B-1 + res ;
            }else{
                B-=(count.get(i)+1);
                res+=count.get(i);
            }
        }
        return res;
    }
}

public class question1 {
    public static void main(String[] args) {

    }
}