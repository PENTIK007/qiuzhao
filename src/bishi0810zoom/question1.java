package bishi0810zoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question1 {
    public static int tempRes = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] colors = new int[n];
        String color = scanner.next();
        for (int i = 0; i < n; i++) {
            colors[i] = color.charAt(i) == 'R' ? 0 : 1;
        }
        scanner.nextLine();
        List<int[]> paths = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String pathStr = scanner.nextLine();
            if (pathStr.isEmpty()) {
                break;
            }
            int[] path = new int[2];
            String[] pathStrs = pathStr.split(" ");
            path[0] = Integer.valueOf(pathStrs[0]);
            path[1] = Integer.valueOf(pathStrs[1]);
            paths.add(path);
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int resI = getRes(i, paths, colors, 0, 0);
            res += resI;
        }
        System.out.println(res);
    }

    public static int getRes(int target, List<int[]> paths, int[] colors, int blueSum, int redSum) {
        tempRes = 0;
        dfs(target, paths, colors, blueSum, redSum);
        return tempRes;
    }
    public static void dfs(int target, List<int[]> paths, int[] colors, int blueSum, int redSum) {
        if (target == 1) {
            if (colors[0] == 0) {
                redSum++;
            } else {
                blueSum++;
            }
            tempRes = Math.abs(redSum - blueSum);
        }
        if (colors[target - 1] == 0) {
            redSum++;
        } else {
            blueSum++;
        }
        for (int[] nums : paths) {
            if (nums[0] >= 0 && nums[1] >= 0) {
                if (nums[0] == target) {
                    int temp = nums[0];
                    nums[0] = -1;
                    dfs(nums[1], paths, colors, blueSum, redSum);
                    nums[0] = temp;
                } else if (nums[1] == target) {
                    int temp = nums[1];
                    nums[1] = -1;
                    dfs(nums[0], paths, colors, blueSum, redSum);
                    nums[1] = temp;
                }
            }
        }
    }
}
