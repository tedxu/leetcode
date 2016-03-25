package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testTwoSum() {
    Solution s = new Solution();
    int[] r = s.twoSum(new int[] { 2, 7, 11, 15 }, 9);
    Assert.assertArrayEquals(new int[] { 1, 2 }, r);
  }

  @Test
  public void testTwoSum2() {
    Solution s = new Solution();
    int[] r = s.twoSum(new int[] { 2, 7, 11, 15 }, 18);
    Assert.assertArrayEquals(new int[] { 2, 3 }, r);

    r = s.twoSum(new int[] { 2, 7, 11, 15 }, 26);
    Assert.assertArrayEquals(new int[] { 3, 4 }, r);
  }

  @Test
  public void testUnOrdered() {
    Solution s = new Solution();
    int[] r = s.twoSum(new int[] { 3, 2, 4 }, 6);
    Assert.assertArrayEquals(new int[] { 2, 3 }, r);
  }

  @Test
  public void testDuplicated() {
    Solution s = new Solution();
    int[] r = s.twoSum(new int[] { 0, 4, 3, 0 }, 0);
    Assert.assertArrayEquals(new int[] { 1, 4 }, r);
  }

}
