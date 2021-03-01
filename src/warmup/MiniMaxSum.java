package warmup;

public class MiniMaxSum {

  // arr [1,3,5,7,9]
  // The minimum sum is 16 and the maximum sum is 24. The function prints
  //16 24
  static void miniMaxSum(int[] arr) {

    // keep track of the highest and lowest seen
    // this is ugly, but I do not know how to deal with the equivalent of Integer.MAX_VALUE
    long lowestSum = Long.MAX_VALUE;
    long highestSum = 0L;
    long currentSum;
    long arraySum = 0L;

    // add the entire array together
    for (int i : arr) {
      arraySum += i;
    }

    // selectively remove numbers to test the min and max
    for (int j : arr) {
      currentSum = arraySum - j;
      highestSum = Long.max(highestSum, currentSum);
      lowestSum = Long.min(lowestSum, currentSum);

    }

    // print the numbers.
    String s = lowestSum + " " + highestSum;
    System.out.println(s);
  }
}
