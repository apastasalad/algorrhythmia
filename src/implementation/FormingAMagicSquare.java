package implementation;

import java.util.Arrays;

public class FormingAMagicSquare {

  // What is the lowest absolute value cost to form a magic square?
  static int formingMagicSquare(int[][] s) {

    int[] cost = {0, 0, 0, 0, 0, 0, 0, 0};

    int[][] allSquares = {
        {4, 9, 2, 3, 5, 7, 8, 1, 6},
        {4, 3, 8, 9, 5, 1, 2, 7, 6},
        {2, 9, 4, 7, 5, 3, 6, 1, 8},
        {2, 7, 6, 9, 5, 1, 4, 3, 8},
        {8, 1, 6, 3, 5, 7, 4, 9, 2},
        {8, 3, 4, 1, 5, 9, 6, 7, 2},
        {6, 1, 8, 7, 5, 3, 2, 9, 4},
        {6, 7, 2, 1, 5, 9, 8, 3, 4}
    };

    for (int i = 0; i < 8; i++) {
      int j = 0;
      for (int k = 0; k < 3; k++) {
        for (int l = 0; l < 3; l++) {
          cost[i] += Math.abs(allSquares[i][j] - s[k][l]);
          j++;
        }
      }
    }

    Arrays.sort(cost);

    return cost[0];
  }
}
