package com.leetcode;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
  
  private int maxDepth(TreeNode root, int depth) {
    if (root == null) {
      return depth;
    } else {
      return Math.max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1));
    }
  }

  public int maxDepth(TreeNode root) {
    return maxDepth(root, 0);
  }
}
