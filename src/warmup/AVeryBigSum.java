package warmup;

public class AVeryBigSum {

  // Calculate and print the sum of the elements in an array,
  // keeping in mind that some of those integers may be quite large.
  static long aVeryBigSum(long[] ar) {

    long result = 0;

    for (long l : ar) {

      result += l;
    }

    return result;
  }
}
