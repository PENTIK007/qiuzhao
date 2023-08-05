package bishi0923kuaishou;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author: wwx
 * @date: 2022/9/23 20:26
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FreqStack freqStack = new FreqStack();
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (temp > 0) {
                freqStack.push(temp);
            } else {
                System.out.println(freqStack.pop());
            }
        }
    }
}
class FreqStack {
    Map<Integer, Integer> map1;
    Map<Integer, Stack<Integer>> map2;
    int maxCount;

    public FreqStack() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        maxCount = 0;
    }

    public void push(int x){
        int f = map1.getOrDefault(x, 0) + 1;
        map1.put(x, f);
        if (f > maxCount) {
            maxCount = f;
        }
        map2.computeIfAbsent(f, z -> new Stack<>()).push(x);
    }

    public int pop(){
        int x = map2.get(maxCount).pop();
        map1.put(x, map1.get(x) - 1);
        if (map2.get(maxCount).size() == 0) {
            maxCount--;
        }
        return x;
    }

}
