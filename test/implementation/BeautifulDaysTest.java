package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeautifulDaysTest {

  @Test
  void beautifulDaysTestOne() {
    int want = 2;
    int got = BeautifulDays.beautifulDays(20, 23, 6);
    Assertions.assertEquals(want, got);
  }

  @Test
  void beautifulDaysTestTwo() {
    int want = 33;
    int got = BeautifulDays.beautifulDays(13, 45, 3);
    Assertions.assertEquals(want, got);
  }
}