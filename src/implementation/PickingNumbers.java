package implementation;

import java.util.List;

public class PickingNumbers {

  /*
   * Given an array of integers, find the longest subarray where
   * the absolute difference between any two elements is less than or equal to 1
   */
  public static int pickingNumbers(List<Integer> a) {

    int[] frequency = new int[101];
    int result = Integer.MIN_VALUE;

    for (int index : a) {
      frequency[index]++;
    }

    for (int i = 1; i <= 100; i++) {
      result = Math.max(result, frequency[i] + frequency[i - 1]);
    }
    return result;
  }
}
