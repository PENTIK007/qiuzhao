package bishi0807dajiang;

import java.util.*;

public class question1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int timePoints_size = 0;
        timePoints_size = in.nextInt();
        if (in.hasNextLine())
            in.nextLine();
        String[] timePoints = new String[timePoints_size];
        String timePoints_item;
        for(int timePoints_i = 0; timePoints_i < timePoints_size; timePoints_i++) {
            try {
                timePoints_item = in.nextLine();
            } catch (Exception e) {
                timePoints_item = null;
            }
            timePoints[timePoints_i] = timePoints_item;
        }

        res = new question1().findMinDifference(timePoints);
        System.out.println(String.valueOf(res));

    }

    public int findMinDifference(String[] timePoints) {
        int length = timePoints.length;
        int[] minutes = new int[length * 2];
        int i = 0;
        int index = 0;
        while (i < length) {
            String[] strings = timePoints[i].split(":");
            int h = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);
            minutes[index] = h * 60 + m;
            minutes[index + 1] = minutes[index] + 1440;
            i++;
            index = index + 2;
        }
        Arrays.sort(minutes);
        int res = minutes[1] - minutes[0];
        for (int j = 0; j < minutes.length - 1; j++) {
            res = Math.min(res, minutes[i + 1] - minutes[i]);
        }
        return res;
    }
}
