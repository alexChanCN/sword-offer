package ch2;

import utils.TreeNode;

public class Q7 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode node = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return node;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int pl, int pr, int[] in, int il, int ir) {
        if (pl > pr || il > ir)     //无节点情况
            return null;
        TreeNode preNode = new TreeNode(pre[pl]);
        for (int i = il; i <= ir; i++) {
            if (pre[pl] == in[i]) {
                preNode.left = reConstructBinaryTree(pre, pl + 1, pl + i - il, in, il, i - 1);
                preNode.right = reConstructBinaryTree(pre, pl + i - il + 1, pr, in, i + 1, ir);
                break;      //剪枝
            }
        }
        return preNode;
    }
}
