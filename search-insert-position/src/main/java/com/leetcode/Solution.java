package com.leetcode;

public class Solution {

  private int searchInsert(int[] a, int begin, int end, int target) {

    if (begin == end) {
      if (a[begin] >= target) {
        return begin;
      } else {
        return begin + 1;
      }
    }

    int pivotal = (begin + end) / 2;
    if (a[pivotal] == target) {
      return pivotal;
    } else if (a[pivotal] > target) {
      pivotal = Math.max(pivotal - 1, begin);
      return searchInsert(a, begin, pivotal, target);
    } else {
      pivotal = Math.min(pivotal + 1, end);
      return searchInsert(a, pivotal, end, target);
    }
  }

  public int searchInsert(int[] A, int target) {
    if (A.length == 0) {
      return 0;
    }
    return searchInsert(A, 0, A.length - 1, target);
  }
}
