package bishi0828meidi;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> generate (int numRows) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
                }
            }
            res.add(row);
        }
        return res;
    }
}
