package com.leetcode;

public class Solution {

  public int reverse(int x) {

    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
      x = -x;
    }

    int padding = 0;
    int reversed = 0;
    while (x != 0) {
      padding = x % 10;
      x /= 10;
      reversed = reversed * 10 + padding;
    }

    return (isNegative ? -1 : 1) * reversed;
  }
}
