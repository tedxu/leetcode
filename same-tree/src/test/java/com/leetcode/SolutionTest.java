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
    
    TreeNode n1 = new TreeNode(0);
    TreeNode n2 = new TreeNode(0);
    TreeNode n3 = new TreeNode(0);
    TreeNode n4 = new TreeNode(0);
    
    TreeNode m1 = new TreeNode(0);
    TreeNode m2 = new TreeNode(0);
    TreeNode m3 = new TreeNode(0);
    TreeNode m4 = new TreeNode(0);
    
    Assert.assertFalse(s.isSameTree(n1, null));
    Assert.assertTrue(s.isSameTree(null, null));
    Assert.assertTrue(s.isSameTree(n1, n2));
    
    n1.right = n2;
    n2.right = n3;
    n3.right = n4;
    
    m1.right = m2;
    m2.right = m3;
    m3.right = m4;
    
    Assert.assertTrue(s.isSameTree(n1, m1));
    
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = null;
    
    m1.left = m2;
    m1.right = m3;
    m2.left = m4;
    m2.right = null;
    
    Assert.assertTrue(s.isSameTree(n1, m1));
  }

}
