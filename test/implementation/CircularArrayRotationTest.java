package implementation;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircularArrayRotationTest {

  @Test
  void circularArrayRotationTestOne() {
    int[] testArray = {1, 2, 3};
    int[] testQueries = {0, 1, 2};
    int[] want = {2, 3, 1};
    int[] got = CircularArrayRotation.circularArrayRotation(testArray, 2, testQueries);

    Assertions.assertEquals(Arrays.toString(want), Arrays.toString(got));
  }

  @Test
  void circularArrayRotationTestTwo() {
    int[] testArray = {1, 2, 3, 4};
    int[] testQueries = {0, 1, 2, 3};
    int[] want = {1, 2, 3, 4};
    int[] got = CircularArrayRotation.circularArrayRotation(testArray, 4, testQueries);

    Assertions.assertEquals(Arrays.toString(want), Arrays.toString(got));
  }
}
