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
    Assert.assertEquals(5, s.numTrees(3));
    Assert.assertEquals(2, s.numTrees(2));
  }

}
