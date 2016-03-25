package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  /**
   * Find index of number target from the number list numbers, range from begin
   * to end, inclusive.
   * 
   * @param numbers
   * @param begin
   * @param end
   * @param target
   * @return index of target, or the nearest lower index of target number if
   *         target is not found.
   */
  private int findNumber(int[] numbers, int begin, int end, int target) {
    if (begin > end) {
      return end;
    }

    int pivotal = (begin + end) / 2;
    if (numbers[pivotal] == target) {
      return pivotal;
    } else if (numbers[pivotal] > target) {
      return findNumber(numbers, begin, pivotal - 1, target);
    } else {
      return findNumber(numbers, pivotal + 1, end, target);
    }
  }

  /**
   * Entrance
   * 
   * @param numbers
   * @param target
   * @return
   */
  public int[] twoSum(int[] numbers, int target) {
    // A solution should exist, so skip edge condition checks.
    // Sort and construct an ordered list first
    int[] origIdxs = sort(numbers);

    int end = numbers.length - 1;
    int diff = 0;
    for (int i = 0; i < numbers.length - 1; i++) {
      diff = target - numbers[i];
      end = findNumber(numbers, i + 1, end, diff);
      if (numbers[end] == diff) {
        int[] result = new int[] { origIdxs[i], origIdxs[end] };
        Arrays.sort(result);
        return result;
      }
    }
    throw new RuntimeException("No solution found");
  }

  /**
   * Sort numbers and return its original indexes.
   * 
   * @param numbers
   * @return original indexes
   */
  private int[] sort(int[] numbers) {
    int[][] complex = new int[numbers.length][2];
    for (int i = 0; i < numbers.length; i++) {
      complex[i][0] = numbers[i];
      complex[i][1] = i + 1;
    }
    Arrays.sort(complex, new Comparator<int[]>() {

      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });
    
    int[] orig = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      orig[i] = complex[i][1];
      numbers[i] = complex[i][0];
    }
    return orig;
  }
}
