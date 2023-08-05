package bishi0906youka;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(0);
        TreeNode treeNode7 = new TreeNode(8);
        TreeNode treeNode8 = new TreeNode(11);
        TreeNode treeNode9 = new TreeNode(6);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode5.left = treeNode8;
        treeNode5.right = treeNode9;
        ArrayList<TreeNode> res = new Question2().findCommonAncestors2(treeNode1, treeNode8, treeNode9);
        for (TreeNode treeNode : res) {
            System.out.println(treeNode.val);
        }
    }
    ArrayList<TreeNode> pRoot = new ArrayList<>();
    ArrayList<TreeNode> qRoot = new ArrayList<>();
    public ArrayList<TreeNode> findCommonAncestors2 (TreeNode root, TreeNode p, TreeNode q) {
        // write code here
        ArrayList<TreeNode> pList = new ArrayList<>();
        ArrayList<TreeNode> qList = new ArrayList<>();
        dfs1(root, p, pList);
        dfs2(root, q, qList);
        pRoot.retainAll(qRoot);
        return pRoot;
    }

    private void dfs1(TreeNode root, TreeNode node, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }
        if (root == node) {
            pRoot = new ArrayList<>(list);
            return;
        }
        list.add(root);
        dfs1(root.left, node, list);
        dfs1(root.right, node, list);
        list.remove(root);
    }
    private void dfs2(TreeNode root, TreeNode node, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }
        if (root == node) {
            qRoot = new ArrayList<>(list);
            return;
        }
        list.add(root);
        dfs2(root.left, node, list);
        dfs2(root.right, node, list);
        list.remove(root);
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
