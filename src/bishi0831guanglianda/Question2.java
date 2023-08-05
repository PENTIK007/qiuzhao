package bishi0831guanglianda;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<Integer[]>(
                new Comparator<Integer[]>() {
                    @Override
                    public int compare(Integer[] o1, Integer[] o2) {
                        if (o1[0] != o2[0]) {
                            return o1[0] - o2[0];
                        }
                        return o1[1] - o2[1];
                    }
                }
        );
        for (int i = 0; i < m; i++) {
            Integer[] temp = new Integer[3];
            temp[0] = scanner.nextInt();
            temp[1] = scanner.nextInt();
            temp[2] = scanner.nextInt();
            priorityQueue.add(temp);
        }
        //for (Integer[] i : priorityQueue) {
        //    for (Integer i1 : i) {
        //        System.out.print(i1 + " ");
        //    }
        //    System.out.println();
        //}
        while (priorityQueue.peek() != null) {
            Integer[] temp = priorityQueue.poll();
            for (Integer i : temp) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
