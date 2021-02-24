package warmup;

public class PlusMinus {

  // Calculate the ratios of positive, negative and zero based integers for an array
  static void plusMinus(int[] arr) {
    int positiveCounter = 0;
    int negativeCounter = 0;
    int zeroCounter = 0;

    for (int j : arr) {
      if (j > 0) {
        positiveCounter++;
      } else if (j < 0) {
        negativeCounter++;
      } else {
        zeroCounter++;
      }
    }

    // Print the ratio of positive integers
    System.out.println((float) positiveCounter / arr.length);

    // Print the ratio of negative integers
    System.out.println((float) negativeCounter / arr.length);

    // Print the ration of integers with value of 0
    System.out.println((float) zeroCounter / arr.length);
  }
}
