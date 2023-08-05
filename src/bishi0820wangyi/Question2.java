package bishi0820wangyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
                list = new ArrayList<>();
                list.add(i);
            } else if (array[i] == max) {
                list.add(i);
            }
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = array[i];
        }
        Arrays.sort(temp);
        int secondMax = 0;
        for (int i = temp.length - 1; i >= 0; i--) {
            if (array[i] != max) {
                secondMax = array[i];
                break;
            }
        }
        int res = 0;
        if (list.size() == 1) {
            int index = list.get(0);
            int a = 0;
            if (index % 2 == 0) {
                a = max;
            } else {
                a = secondMax;
            }
            for (int i = 0; i < array.length; i++) {
                res += a - array[i];
                if (a == max) {
                    a = secondMax;
                } else if (a == secondMax) {
                    a = max;
                }
            }
        } else {
            boolean flag = true;
            for (int i = 1; i < list.size(); i++) {
                if ((list.get(i) - list.get(i - 1)) % 2 != 0) {
                    flag = false;
                }
            }
            if (flag) {
                int index = list.get(0);
                int a = 0;
                if (index % 2 == 0) {
                    a = max;
                } else {
                    a = secondMax;
                }
                for (int i = 0; i < array.length; i++) {
                    res += a - array[i];
                    if (a == max) {
                        a = secondMax;
                    } else if (a == secondMax) {
                        a = max;
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    res += (max - array[i]);
                }
            }
        }
        //if (list.size() > 1) {
        //    boolean flag = true;
        //    int maxIndex = list.get(0);
        //    int maxside = 0;
        //    if (list.get(0) > 0 && list.get(0) < n) {
        //        maxside = Math.max(array[list.get(0) - 1], array[list.get(0) - 1]);
        //    } else if (list.get(0) > 0) {
        //        maxside = array[list.get(0) - 1];
        //    } else if (list.get(0) < n) {
        //        maxside = array[list.get(0) + 1];
        //    }
        //    for (int i = 1; i < list.size(); i++) {
        //        if ((list.get(i) - list.get(i - 1)) % 2 != 0) {
        //            flag = false;
        //        }
        //    }
        //    if (flag) {
        //
        //    } else {
        //
        //    }
        //}
        System.out.println(res);
    }
}
