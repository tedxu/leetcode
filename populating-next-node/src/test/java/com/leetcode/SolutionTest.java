package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testSameTree() {
    Solution s = new Solution();

    TreeLinkNode n1 = new TreeLinkNode(1);
    TreeLinkNode n2 = new TreeLinkNode(2);
    TreeLinkNode n3 = new TreeLinkNode(3);
    TreeLinkNode n4 = new TreeLinkNode(4);
    TreeLinkNode n5 = new TreeLinkNode(5);
    TreeLinkNode n6 = new TreeLinkNode(6);
    TreeLinkNode n7 = new TreeLinkNode(7);

    s.connect(null);
    
    s.connect(n1);
    Assert.assertNull(n1.next);

    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    n3.left = n6;
    n3.right = n7;

    s.connect(n1);
    
    Assert.assertEquals(n3, n2.next);
    Assert.assertNull(n3.next);
    Assert.assertEquals(n6, n5.next);
  }

}
