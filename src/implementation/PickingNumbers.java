package implementation;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {

  /*
   * Given an array of integers, find the longest subarray where
   * the absolute difference between any two elements is less than or equal to 1
   */
  public static int pickingNumbers(List<Integer> a) {

    Collections.sort(a);
    int subArrayCount = 0;
    int maxLength = 0;

    // Look for the maximum length
    for (int i = 0; i < a.size(); i++) {
      for (int j = i; j < a.size(); j++) {
        if (Math.abs(a.get(j) - a.get(i)) <= 1) {
          subArrayCount++;
        }
      }
      // if this is the longest chain, then record it.
      if (subArrayCount > maxLength) {
        maxLength = subArrayCount;
      }
      subArrayCount = 0;
    }
    return maxLength;
  }
}
