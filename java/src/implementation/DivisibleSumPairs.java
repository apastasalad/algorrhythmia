package implementation;

public class DivisibleSumPairs {

  // Complete the divisibleSumPairs function below.
  static int divisibleSumPairs(int n, int k, int[] ar) {

    int validPairsCounter = 0;

    // find a valid pair
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i < j) {
          // if the sum of the pair is divisible by k, add it to the list.
          if ((ar[i] + ar[j]) % k == 0) {
            validPairsCounter++;
          }
        }
      }
    }

    return validPairsCounter;
  }
}
