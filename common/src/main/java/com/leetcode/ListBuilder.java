package com.leetcode;

/**
 * This class is NOT Thread-safe
 * @author ted
 *
 */
public class ListBuilder {
  
  ListNode head;
  ListNode tail;
  
  public ListBuilder() {
    head = null;
    tail = null;
  }
  
  public ListBuilder addNode(int val) {
    ListNode n = new ListNode(val);
    if (head == null) {
      head = n;
      tail = head;
    } else {
      tail.next = n;
      tail = n;
    }
    return this;
  }
  
  public ListNode build(){
    return head;
  }
}
