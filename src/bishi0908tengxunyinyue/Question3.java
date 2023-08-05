package bishi0908tengxunyinyue;

public class Question3 {
    public static void main(String[] args) {

    }
    public int getTreeSum (TreeNode tree) {
        // write code here
        if (tree == null) {
            return 0;
        }
        if (tree.left == null && tree.right == null) {
            return 1;
        }
        long left = getTreeSum(tree.left);
        long right = getTreeSum(tree.right);
        long max = Math.max(left, right);
        long res = (max * 2 + 1) % (1000000000 + 7);
        return (int) res;
    }
}
class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;
  public TreeNode(int val) {
    this.val = val;
  }
}
