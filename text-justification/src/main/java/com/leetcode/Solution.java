package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> fullJustify(String[] words, int L) {
    List<String> justified = new ArrayList<String>();
    if (words == null || words.length <= 0) {
      return justified;
    }

    List<String> buffer = new ArrayList<String>();
    int accLength = 0;
    for (String word : words) {
      if (accLength == 0) {
        accLength = word.length();
        if (accLength >= L) {
          accLength = 0;
          // Add the whole word
          justified.add(word);
          continue;
        }
      } else {
        if (accLength + 1 + word.length() > L) {
          justified.add(justify(buffer, L, accLength));
          buffer.clear();
          accLength = word.length();
        } else {
          accLength += 1 + word.length();
        }
      }
      buffer.add(word);
    }

    // Final line is left justified
    if (!buffer.isEmpty()) {
      StringBuilder sb = new StringBuilder();
      for (String word : buffer) {
        if (sb.length() > 0) {
          sb.append(' ');
        }
        sb.append(word);
      }
      while (sb.length() < L) {
        sb.append(' ');
      }
      justified.add(sb.toString());
    }

    return justified;
  }

  private String justify(List<String> buffer, int L, int accLength) {
    int numSpaces = L - accLength;
    assert (numSpaces >= 0);

    int eqpad = 0;
    int pripad = 0;
    int trailing = 0;

    if (buffer.size() > 1) {
      eqpad = numSpaces / (buffer.size() - 1) + 1;
      pripad = numSpaces % (buffer.size() - 1);
    } else {
      trailing = numSpaces;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < buffer.size(); i++) {
      if (i > 0) {
        int pad = eqpad + (pripad >= i ? 1 : 0);
        for (int j = 0; j < pad; j++) {
          sb.append(" ");
        }
      }
      sb.append(buffer.get(i));
    }
    for (int i = 0; i < trailing; i++) {
      sb.append(' ');
    }
    return sb.toString();
  }
}


