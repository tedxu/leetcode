package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testDeleteDuplicates() {
    Solution s = new Solution();
    ListBuilder builder = new ListBuilder();
    ListNode list = builder.addNode(1).addNode(1).addNode(2).build();
    ListNode list1 = s.deleteDuplicates(list);
    Assert.assertArrayEquals(new Integer[]{1, 2}, ListUtils.toArray(list1));
    
    builder = new ListBuilder();
    list = builder.addNode(1).addNode(1).addNode(2).addNode(3).addNode(3).build();
    list1 = s.deleteDuplicates(list);
    Assert.assertArrayEquals(new Integer[]{1, 2, 3}, ListUtils.toArray(list1));
    
    Assert.assertArrayEquals(new Integer[]{}, ListUtils.toArray(null));
  }

}
