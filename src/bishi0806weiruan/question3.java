package bishi0806weiruan;

import java.util.*;
class Solution3 {
    public boolean solution(int[] A, int[] B, int S) {
        // write your code in Java 8 (Java SE 8)
        boolean[] dict = new boolean[S];
        for (int i = 0; i < S; i++) {
            dict[i] = true;
        }
        return dfs(dict,A,B,0);
    }
    public static  boolean dfs(boolean[] dict,int[] A, int[] B,int k){
        if(k==A.length){
            return true;
        }
        int a = A[k];
        int b = B[k];
        boolean flag1 = false;
        if(dict[a-1] == true){
            dict[a-1] = false;
            flag1 = dfs(dict,A,B,++k);
            k--;
            dict[a-1] = true;
        }
        boolean flag2 = false;
        if(dict[b-1] == true){
            dict[b-1] = false;
            flag2 = dfs(dict,A,B,++k);
            k--;
            dict[b-1] = true;
        }
        return flag1||flag2;
    }
}
public class question3 {
}
