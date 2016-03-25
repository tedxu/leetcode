package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testSearchInsert() {
    Solution s = new Solution();
    Assert.assertEquals(2, s.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    Assert.assertEquals(1, s.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    Assert.assertEquals(4, s.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    Assert.assertEquals(0, s.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
  }

  @Test
  public void testSearchInsert2() {
    Solution s = new Solution();
    Assert.assertEquals(0, s.searchInsert(new int[] {}, 2));
    Assert.assertEquals(1, s.searchInsert(new int[] { 1 }, 2));
  }

}
