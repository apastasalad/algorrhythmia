package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppleAndOrangeTest {

  @Test
  void countApplesAndOrangesTestOne() {
    AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
  }

  @Test
  void countApplesAndOrangesTestTwo() {
    int want = 1;
    int got = AppleAndOrange.howManyApplesOnDaHouse(7, 11, 5, new int[]{-2, 2, 1});

    Assertions.assertEquals(want, got);
  }

  @Test
  void countApplesAndOrangesTestThree() {
    int want = 1;
    int got = AppleAndOrange.howManyOrangesOnDaHouse(7, 11, 15, new int[]{5, -6});

    Assertions.assertEquals(want, got);
  }
}