package com.leetcode;

public class Solution {
  public void connect(TreeLinkNode root) {
    // Only constant extra space used.
    if (root == null) {
      return;
    }

    TreeLinkNode nextHead = root;
    while (true) {
      TreeLinkNode n = nextHead;
      nextHead = n.left;
      if (nextHead == null) {
        break;
      }
      nextHead.next = n.right;
      TreeLinkNode nextCurrent = n.right;
      n = n.next;
      while (n != null) {
        nextCurrent.next = n.left;
        n.left.next = n.right;
        nextCurrent = n.right;
        n = n.next;
      }
    }
  }
}
