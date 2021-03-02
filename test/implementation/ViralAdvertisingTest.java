package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ViralAdvertisingTest {

  @Test
  void viralAdvertisingTestOne() {
    int want = 9;
    int got = ViralAdvertising.viralAdvertising(3);

    Assertions.assertEquals(want, got);
  }

  @Test
  void viralAdvertisingTestTwo() {
    int want = 15;
    int got = ViralAdvertising.viralAdvertising(4);

    Assertions.assertEquals(want, got);
  }
}