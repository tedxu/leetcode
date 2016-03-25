package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
  
  /**
   * Preorder traverse in a non-recursive way.
   * 
   * @param root
   * @return
   */
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> route = new ArrayList<Integer>();
    
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    
    while (!stack.isEmpty()) {
      TreeNode n = stack.pop();
      if (n != null) {
        route.add(n.val);
        stack.push(n.right);
        stack.push(n.left);
      }
    }
    
    return route;
  }
}
