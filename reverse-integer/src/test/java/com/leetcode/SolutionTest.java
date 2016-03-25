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
    Assert.assertEquals(321, s.reverse(123));
    Assert.assertEquals(-321, s.reverse(-123));
    
    Assert.assertEquals(0, s.reverse(0));
    Assert.assertEquals(1, s.reverse(100));
  }

}
