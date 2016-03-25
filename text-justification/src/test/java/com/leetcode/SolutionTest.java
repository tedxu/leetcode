package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
  @Test
  public void testFullJustify() {
    String[] case1 = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
    Solution solution = new Solution();
    List<String> actual = solution.fullJustify(case1, 16);
    Assert.assertThat(
            actual,
            is(Arrays.asList("This    is    an",
                    "example  of text",
                    "justification.  "))
    );
  }

  @Test
  public void testDivByZero() {
    String[] case1 = new String[]{"Listen", "to", "many,", "speak", "to", "a", "few."};
    Solution solution = new Solution();
    List<String> actual = solution.fullJustify(case1, 6);
    Assert.assertThat(
            actual,
            is(Arrays.asList("Listen", "to    ", "many, ", "speak ", "to   a", "few.  "))
    );
  }
}
