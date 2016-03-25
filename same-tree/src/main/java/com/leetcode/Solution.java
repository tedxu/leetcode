package com.leetcode;

public class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null) {
      return q == null ? true : false;
    } else if (q == null) {
      return false;
    }
    if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
      return true;
    }
    return false;
  }
}
