package implementation;


public class CircularArrayRotation {

  /**
   * Rotate the array and return  the results of the queries to the array.
   */
  static int[] circularArrayRotation(int[] a, int k, int[] queries) {

    int[] tempArray = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      tempArray[(i + k) % a.length] = a[i];
    }

    for (int i = 0; i < queries.length; i++) {
      queries[i] = tempArray[queries[i]];
    }

    return queries;
  }
}
