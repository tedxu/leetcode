package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testSingleNumber() {
    Solution s = new Solution();
    Assert.assertEquals(3, s.maxProfit(new int[] { 1, 2, 3, 4 }));
    Assert.assertEquals(0, s.maxProfit(new int[] { 4, 3, 2, 1 }));
    Assert.assertEquals(0, s.maxProfit(new int[] { 1, 1, 1, 1 }));
    Assert.assertEquals(4, s.maxProfit(new int[] { 1, 3, 2, 4 }));

    Assert.assertEquals(0, s.maxProfit(new int[] { 1 }));

    Assert.assertEquals(2, s.maxProfit(new int[] { 2, 1, 2, 0, 1 }));
  }

}
