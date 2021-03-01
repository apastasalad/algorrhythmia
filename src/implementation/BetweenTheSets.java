package implementation;

import java.util.List;

public class BetweenTheSets {


  /*
   * Retrieve the number between two sets/
   */
  public static int getTotalX(List<Integer> a, List<Integer> b) {

    // Find the Lowest Common Multiple for the List (A)
    int lowestCommonMultiple = a.get(0);

    // look at the other elements and find the lowest common multiple
    for (int i = 1; i < a.size(); i++) {
      lowestCommonMultiple = lcm(lowestCommonMultiple, a.get(i));
    }

    // Find Greatest Common Divisor for the List (B)
    int greatestCommonDivisor = b.get(0);

    // look at the other elements and find the greatest common divisor
    for (int i = 1; i < b.size(); i++) {
      greatestCommonDivisor = gcd(greatestCommonDivisor, b.get(i));
    }

    /* Count the number of multiples of the LCM, which are factors of the GCD. */
    int count = 0;
    for (int i = lowestCommonMultiple, j = 1; i <= greatestCommonDivisor;
        i = j * lowestCommonMultiple) {
      if (greatestCommonDivisor % i == 0) {
        count++;
      }
      j++;
    }
    return count;
  }

  private static int gcd(int a, int b) {
    if (a == 0) {
      return b;
    }
    return gcd(b % a, a);
  }

  private static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

}
