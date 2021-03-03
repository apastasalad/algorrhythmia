package implementation;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

  /**
   * Rotate the array and return  the results of the queries to the array.
   */
  static int[] circularArrayRotation(int[] a, int k, int[] queries) {

    int[] results = new int[queries.length];

    // If we are rotating the array the same number as the number of elements, then there is
    // no change to the array
    if (k == a.length) {
      for (int i : queries) {
        results[i] = a[i];
      }
    }

    return results;
  }
}
