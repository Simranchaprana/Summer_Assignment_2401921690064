package week4.Day1;

import javax.swing.tree.TreeNode;

public class Leet2 {
    TreeNode invertTreeRecursive(TreeNode root) {

    if (root == null)
      return null;

    TreeNode temp = root.right;
    root.right = root.left;
    root.left = temp;

    invertTree(root.left);
    invertTree(root.right);

    return root;
  }

    
}
