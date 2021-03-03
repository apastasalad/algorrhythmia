package implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rotation {


  /**
   * Rotate the array right and return the results of the queries to the array.
   */
  static int[] rotateRight(int[] a, int k, int[] queries) {

    List<Integer> tempList = Arrays.stream(a).boxed().collect(Collectors.toList());

    int[] results = new int[queries.length];

    for (int counter = 0; counter < k; counter++) {
      int pop = tempList.remove(tempList.size() - 1);
      tempList.add(0, pop); // push
    }

    for (int i = 0; i < results.length; i++) {
      results[i] = tempList.get(queries[i]);
    }

    return results;
  }
}
