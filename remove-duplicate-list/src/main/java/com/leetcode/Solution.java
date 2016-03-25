package com.leetcode;

import com.leetcode.ListNode;

public class Solution {
  /**
   * Remove duplicate in sorted list.
   * 
   * Note that this function will do removal on the go, the processing list
   * <code>head</code> will be changed.
   * 
   * @param head
   * @return
   */
  public ListNode deleteDuplicates(ListNode head) {
    ListNode node = head;
    ListNode lastNode = null;
    while (node != null) {
      if (lastNode != null && lastNode.val == node.val) {
        node = node.next;
        lastNode.next = node;
      } else {
        lastNode = node;
        node = node.next;
      }
    }
    return head;
  }
}
