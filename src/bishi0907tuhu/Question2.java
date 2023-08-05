package bishi0907tuhu;

public class Question2 {
    public static void main(String[] args) {

    }
    static int res = 0;
    public int sum (TreeNode root) {
        // write code here
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.val % 2 != 0) {
            if (root.left != null && root.left.left != null) {
                res += root.left.left.val;
            }
            if (root.left != null && root.left.right != null) {
                res += root.left.right.val;
            }
            if (root.right != null && root.right.left != null) {
                res += root.right.left.val;
            }
            if (root.right != null && root.right.right != null) {
                res += root.right.right.val;
            }
        }
        dfs(root.left);
        dfs(root.right);
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