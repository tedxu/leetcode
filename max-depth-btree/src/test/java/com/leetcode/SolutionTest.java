package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testMaxDepth() {
    Solution s = new Solution();
    
    TreeNode n1 = new TreeNode(0);
    TreeNode n2 = new TreeNode(0);
    TreeNode n3 = new TreeNode(0);
    TreeNode n4 = new TreeNode(0);
    
    Assert.assertEquals(1, s.maxDepth(n1));
    
    n1.right = n2;
    n2.right = n3;
    n3.right = n4;
    
    Assert.assertEquals(4, s.maxDepth(n1));
    
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = null;
    
    Assert.assertEquals(3, s.maxDepth(n1));
  }

}
