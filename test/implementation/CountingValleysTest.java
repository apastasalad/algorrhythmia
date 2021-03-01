package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingValleysTest {

  @Test
  void countingValleysTestOne() {

    String steps = "UDDDUDUU";
    int want = 1;
    int got = CountingValleys.countingValleys(8, steps);

    Assertions.assertEquals(want, got);
  }

  @Test
  void countingValleysTestTwo() {

    String steps = "DDUUDDUDUUUD";
    int want = 2;
    int got = CountingValleys.countingValleys(12, steps);

    Assertions.assertEquals(want, got);
  }
}