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
    
    ListNode n1 = new ListNode(0);
    ListNode n2 = new ListNode(0);
    ListNode n3 = new ListNode(0);
    ListNode n4 = new ListNode(0);
    
    Assert.assertFalse(s.hasCycle(null));
    Assert.assertFalse(s.hasCycle(n1));
    
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    
    Assert.assertFalse(s.hasCycle(n1));
    
    n1.next = n2;
    n2.next = n3;
    n3.next = n2;
    
    Assert.assertTrue(s.hasCycle(n1));
  }

}
