package implementation;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PickingNumbersTest {

  @Test
  void pickingNumbersTestOne() {
    Integer[] testArray = {4, 6, 5, 3, 3, 1};
    int want = 3;
    int got = PickingNumbers.pickingNumbers(Arrays.asList(testArray));
    Assertions.assertEquals(want, got);
  }

  @Test
  void pickingNumbersTestTwo() {
    Integer[] testArray = {1, 2, 2, 3, 1, 2};
    int want = 5;
    int got = PickingNumbers.pickingNumbers(Arrays.asList(testArray));
    Assertions.assertEquals(want, got);
  }
}