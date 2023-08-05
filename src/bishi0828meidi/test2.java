package bishi0828meidi;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> generate (int numRows) {
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            if(i == 1){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                list1.add(list);
            }else if(i == 2){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(1);
                list1.add(list);
            }else{
                List<Integer> listUp = list1.get(i - 2);
                int size = listUp.size();
                ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                for (int j = 0; j < size - 1; j++) {
                    int add = listUp.get(j) + listUp.get(j + 1);
                    list.add(add);
                }
                list.add(1);
                list1.add(list);
            }
        }
        return list1;
    }
}
