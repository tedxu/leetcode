package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution {

  /**
   * Inorder traverse in a non-recursive way.
   * 
   * @param root
   * @return
   */
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> route = new ArrayList<Integer>();

    Stack<TreeNode> stack = new Stack<TreeNode>();
    // First time push stack, second time traverse.
    Set<TreeNode> visited = new HashSet<TreeNode>();
    stack.push(root);
    
    while (!stack.isEmpty()) {
      TreeNode n = stack.pop();
      if (n == null) {
        continue;
      }
      if (visited.contains(n)) {
        route.add(n.val);
      } else {
        stack.push(n.right);
        stack.push(n);
        stack.push(n.left);
        visited.add(n);
      }
    }

    return route;
  }
}
