package implementation;

public class FindDigits {

  // Complete the findDigits function below.
  static int findDigits(int n) {

    int numDivisors = 0;

    // break the input into separate integer values
    String digitString = String.valueOf(n);


    for (char ch : digitString.toCharArray()) {
      int digit = Integer.parseInt(String.valueOf(ch));

      if ((digit != 0) && (n % digit == 0)) {
        numDivisors++;
      }
    }

    return numDivisors;
  }
}
