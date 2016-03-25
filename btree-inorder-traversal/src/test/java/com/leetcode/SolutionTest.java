package com.leetcode;

import static org.hamcrest.core.Is.is;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testSameTree() {
    Solution s = new Solution();

    TreeNode n1 = new TreeNode(1);
    TreeNode n2 = new TreeNode(2);
    TreeNode n3 = new TreeNode(3);
    TreeNode n4 = new TreeNode(4);

    Assert.assertEquals(0, s.inorderTraversal(null).size());
    Assert.assertEquals(1, s.inorderTraversal(n1).size());

    n1.right = n2;
    n2.right = n3;
    n3.right = n4;

    Assert.assertThat(s.inorderTraversal(n1), is(Arrays.asList(1, 2, 3, 4)));

    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = null;
    n3.left = null;
    n3.right = null;

    Assert.assertThat(s.inorderTraversal(n1), is(Arrays.asList(4, 2, 1, 3)));
  }

}
