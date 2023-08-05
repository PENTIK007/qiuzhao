package bishi0827jindong;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);
            } else {
                map2.put(nums[i], map2.getOrDefault(nums[i], 0) + 1);
            }
        }
        PriorityQueue<int[]> priorityQueue1 = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        PriorityQueue<int[]> priorityQueue2 = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        int res = 0;
        //for (Integer i : map1.keySet()) {
        //    priorityQueue1.add(new int[]{i, map1.get(i)});
        //}
        for (Map.Entry<Integer, Integer> node : map1.entrySet()) {
            priorityQueue1.add(new int[]{node.getKey(), node.getValue()});
        }
        //for (Integer i : map2.keySet()) {
        //    priorityQueue2.add(new int[]{i, map2.get(i)});
        //}
        for (Map.Entry<Integer, Integer> node : map2.entrySet()) {
            priorityQueue2.add(new int[]{node.getKey(), node.getValue()});
        }
        while (priorityQueue1.peek()[0] == priorityQueue2.peek()[0]) {
            if (priorityQueue1.peek()[1] >= priorityQueue2.peek()[1]) {
                priorityQueue2.poll();
            } else {
                priorityQueue1.poll();
            }
        }
        System.out.println(n - priorityQueue1.peek()[1] - priorityQueue2.peek()[1]);
    }
}
