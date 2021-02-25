package implementation;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArrayDivisionTest {

  @Test
  void birthdayTestOne() {
    Integer[] testArray = {1, 2, 1, 3, 2};
    int want = 2;
    int got = SubArrayDivision.birthday(Arrays.asList(testArray), 3, 2);

    Assertions.assertEquals(want, got);
  }

  @Test
  void birthdayTestTwo() {
    Integer[] testArray = {1, 1, 1, 1, 1, 1};
    int want = 0;
    int got = SubArrayDivision.birthday(Arrays.asList(testArray), 3, 2);

    Assertions.assertEquals(want, got);
  }

  @Test
  void birthdayTestThree() {
    Integer[] testArray = {4};
    int want = 1;
    int got = SubArrayDivision.birthday(Arrays.asList(testArray), 4, 1);

    Assertions.assertEquals(want, got);
  }
}