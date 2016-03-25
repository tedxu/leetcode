package com.leetcode;

import java.util.ArrayList;

public class ListUtils {
  public static ArrayList<Integer> toArrayList(ListNode head) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ListNode node = head;
    while(node != null) {
      list.add(node.val);
      node = node.next;
    }
    return list;
  }
  
  public static Integer[] toArray(ListNode head) {
    ArrayList<Integer> list = toArrayList(head);
    return list.toArray(new Integer[list.size()]);
  }
}
