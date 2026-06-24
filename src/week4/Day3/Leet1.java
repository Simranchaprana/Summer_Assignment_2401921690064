package week4.Day3;

import javax.swing.tree.TreeNode;

public class Leet1 {
    public TreeNode searchBST(TreeNode root, int val) {
                while (root != null) {
            if (root.val == val) {
                return root;
            } else if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;

    }
}
