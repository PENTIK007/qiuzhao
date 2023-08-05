package bishi0806meituan;

import java.util.*;

public class question4 {
}
class Main4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<List<Integer>> yangbengnums = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            yangbengnums.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            yangbengnums.get(scanner.nextInt() - 1).add(i);
        }
        ArrayList<Integer> xunlianList = new ArrayList<>();
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i < yangbengnums.size(); i++) {
            int size = yangbengnums.get(i).size();
            for (int j = 0; j < size; j++) {
                if (j < (size + 1) / 2) {
                    xunlianList.add(yangbengnums.get(i).get(j));
                } else {
                    testList.add(yangbengnums.get(i).get(j));
                }
            }
        }
        Collections.sort(xunlianList);
        Collections.sort(testList);
        for (Integer integer : xunlianList) {
            System.out.print(integer + 1 + " ");
        }
        System.out.println();
        for (Integer integer : testList) {
            System.out.print(integer + 1 + " ");
        }
    }
}

