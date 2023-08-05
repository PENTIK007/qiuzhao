package bishi1016tengxun;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: wwx
 * @date: 2022/10/16 19:53
 * @describe:
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.addLast(scanner.nextInt());
        }
        ArrayList<Integer> res = new ArrayList<>();
        boolean flag = true;
        while (!linkedList.isEmpty()) {
            int head = linkedList.peekFirst();
            int end = linkedList.peekLast();
            if (flag) {
                if (head >= end) {
                    res.add(head);
                    linkedList.removeFirst();
                } else {
                    res.add(end);
                    linkedList.removeLast();
                }
            } else {
                if (head <= end) {
                    res.add(head);
                    linkedList.removeFirst();
                } else {
                    res.add(end);
                    linkedList.removeLast();
                }
            }
            flag = !flag;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
