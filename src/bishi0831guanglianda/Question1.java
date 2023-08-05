package bishi0831guanglianda;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> start = new LinkedList<>();
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            end[i] = scanner.nextInt();
        }
        HashSet<Integer> hashSet = new HashSet<>();
        int index = 0;
        while (!start.isEmpty()) {
            int head = start.peek();
            if (hashSet.contains(head)) {
                start.poll();
            } else if (end[index] != head) {
                hashSet.add(end[index]);
                index++;
            } else if (end[index] == head) {
                start.poll();
                index++;
            }
        }
        System.out.println(hashSet.size());
    }
}
