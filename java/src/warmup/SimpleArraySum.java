package warmup;

public class SimpleArraySum {

  /*
   * Given an array of integers, find the sum of its elements.
   */
  static int simpleArraySum(int[] ar) {

    int sumOfElements = 0;

    for (int i : ar) {
      sumOfElements += i;
    }

    return sumOfElements;
  }


}
