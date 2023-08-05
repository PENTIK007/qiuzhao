package bishi0913baidu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breakCount = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                breakCount++;
            }
            if (breakCount > 1) {
                break;
            }
            if (str.contains("for")) {
                arrayList.add("for");
            }
            if (str.contains("if")) {
                arrayList.add("if");
            }
            if (str.contains("}")) {
                arrayList.add("}");
            }
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == "if") {
                arrayList.set(i, "");
                while (i < arrayList.size()) {
                    if (arrayList.get(i) == "for") {
                        stack.push("for");
                    } else if (arrayList.get(i) == "}") {
                        if (stack.size() == 0) {
                            arrayList.set(i, "");
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                    i++;
                }
            }
        }
        int max = 0;
        int temp = 0;
        for (String s : arrayList) {
            if (s == "for") {
                temp++;
            } else if (s == "}") {
                temp--;
            }
            max = Math.max(max, temp);
        }
        System.out.println(max);
    }
}
