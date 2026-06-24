package week4.Day3;

import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leet3 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;  
    }
}
