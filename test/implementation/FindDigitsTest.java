package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindDigitsTest {

  @Test
  void findDigitsTestOne() {
    int want = 2;
    int got = FindDigits.findDigits(12);

    Assertions.assertEquals(want, got);
  }

  @Test
  void findDigitsTestTwo() {
    int want = 3;
    int got  = FindDigits.findDigits(1012);

    Assertions.assertEquals(want, got);
  }
}