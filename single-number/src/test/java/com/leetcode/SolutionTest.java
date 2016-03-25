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
    Assert.assertEquals(1, s.singleNumber(new int[] { 1 }));
    Assert.assertEquals(1, s.singleNumber(new int[] { 0, 0, 1 }));
    Assert.assertEquals(1, s.singleNumber(new int[] { 0, 0, 1, 2, 2 }));
  }

}
