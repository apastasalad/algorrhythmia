package implementation;

import java.util.List;

public class SubArrayDivision {

  /**
   * Try and divide a chocolate bar with numbers on it. Locate consecutive squares of chocolate that
   * sum to the numbers d and the number of pieces == length m
   */
  static int birthday(List<Integer> s, int d, int m) {

    int chocolateBarLength = s.size();
    int numberOfWaysToDivideChocolate = 0;
    int sumOfThePieces = 0;

    // Loop only as far as we can. length - m pieces
    for (int i = 0; (i <= chocolateBarLength - m); i++) {

      // look at the next m pieces
      for (int j = 0; j < m; j++) {
        sumOfThePieces += s.get(j + i);
      }

      // can we divide the chocolate bar this way?
      if (sumOfThePieces == d) {
        numberOfWaysToDivideChocolate++;
      }

      // reset the sum of the pieces to zero and look at the next window.
      sumOfThePieces = 0;
    }
    return numberOfWaysToDivideChocolate;
  }
}
