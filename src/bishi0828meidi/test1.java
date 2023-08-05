package bishi0828meidi;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        System.out.println(findPrimeNumber(1, 10));


    }
    public static ArrayList<Integer> findPrimeNumber (int m, int n) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = m; i <= n ; i++) {
            int j = 2;
            while(j <= (i / j)){
                if(i % j == 0){
                    break;
                }
                j++;
            }
            if(j > (i / j)){
                list.add(i);
            }
        }
        return list;
    }
}
