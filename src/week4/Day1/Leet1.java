package week4.Day1;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Leet1 {
    public int maxDepth(TreeNode root) {
        if (root == null)
      return 0;

    Queue<TreeNode> nodes = new LinkedList<>();

    nodes.add(root);
    int levels = 0;

    while (!nodes.isEmpty()) {

      levels++;
      int size = nodes.size();
      for (int i = 0; i < size; i++) {
        TreeNode poppedNode = nodes.poll();
        if (poppedNode.left != null) nodes.add(poppedNode.left);
        if (poppedNode.right != null) nodes.add(poppedNode.right);
      }

    }

    return levels; 
    }
}
