package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormingAMagicSquareTest {

  @Test
  void formingMagicSquareTestOne() {

    int[][] testArray = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
    int want = 1;
    int got = FormingAMagicSquare.formingMagicSquare(testArray);

    Assertions.assertEquals(want, got);
  }

  @Test
  void formingMagicSquareTestTwo() {

    int[][] testArray = {{4, 8, 2}, {4, 5, 7}, {6, 1, 6}};
    int want = 4;
    int got = FormingAMagicSquare.formingMagicSquare(testArray);

    Assertions.assertEquals(want, got);
  }
}