package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Rotation {


  /**
   * Rotate the array right and return the results of the queries to the array.
   */
  static int[] rotateRightWithArray(int[] a, int k, int[] queries) {

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

  /**
   * Rotate the array right.
   */
  static int[] rotateRight(int[] a, int k, int[] queries) {

    Queue<Integer> queue = new LinkedList<>();
    int[] results = new int[queries.length];

    for (int i : a) {
      queue.offer(i);
    }

    for (int counter = 0; counter < k; counter++) {
      queue.offer(queue.poll());
    }

    List<Integer> rotatedList = new ArrayList<>(queue);
    for (int i = 0; i < results.length; i++) {
      results[i] = rotatedList.get(queries[i]);
    }

    return results;
  }
}
