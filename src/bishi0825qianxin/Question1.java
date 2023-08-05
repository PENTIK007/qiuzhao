package bishi0825qianxin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question1 {
    //List<List<Integer>> res = new ArrayList<>();
    //LinkedList<Integer> path = new LinkedList<>();
    public int DagPathNum (int[][] nodes) {
        // write code here
        ArrayList<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        path.add(0);
        backTrack(nodes, 0, nodes.length - 1, res, path);
        return res.size();
    }

    public void backTrack(int[][] nodes, int start, int end, List<List<Integer>> res, LinkedList<Integer> path) {
        if (start == end) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i : nodes[start]) {
            path.add(i);
            backTrack(nodes, i, end, res, path);
            path.removeLast();
        }
    }
}
