package warmup;

import java.util.List;

public class DiagonalDifference {


  // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
  public static int diagonalDifference(List<List<Integer>> arr) {
    int left2right = 0;
    int right2left = 0;
    int rightPos = arr.size() - 1;

    // calculate the sum of the left 2 right diagonal
    for (int i = 0; i < arr.size(); i++) {
      left2right += arr.get(i).get(i);
    }

    // calculate the sum of the right 2 left diagonal
    for (List<Integer> integers : arr) {
      right2left += integers.get(rightPos);
      rightPos--;
    }

    // return the absolute value of the difference between these diagonals
    return Math.abs(left2right - right2left);
  }
}
