package com.leetcode;

public class Solution {
  public boolean hasCycle(ListNode head) {
    
    ListNode step1 = head;
    ListNode step2 = head;
    
    while (step1 != null && step2 != null) {
      step1 = step1.next;
      step2 = step2.next;
      if (step2 == null) {
        break;
      }
      step2 = step2.next;
      
      if (step1 == step2) {
        return true;
      }
    }
    return false;
  }
}