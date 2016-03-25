package com.leetcode;

public class Solution {
  public int numTrees(int from, int to) {
    if (from == to) {
      return 1;
    }

    if (from + 1 == to) {
      return 2;
    }

    int num = 0;
    num += numTrees(from + 1, to);
    num += numTrees(from, to - 1);
    for (int i = from + 1; i < to; i++) {
      num += numTrees(from, i - 1) * numTrees(i + 1, to);
    }
    return num;
  }

  public int numTrees(int n) {
    return numTrees(1, n);
  }
}