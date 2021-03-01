package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TheHurdleRaceTest {

  @Test
  void hurdleRaceTestOne() {
    int[] testArray = {1, 2, 3, 3, 2};
    int want = 2;
    int got = TheHurdleRace.hurdleRace(1, testArray);

    Assertions.assertEquals(want, got);
  }

  @Test
  void hurdleRaceTestTwo() {
    int[] testArray = {1, 6, 3, 5, 2};
    int want = 2;
    int got = TheHurdleRace.hurdleRace(4, testArray);

    Assertions.assertEquals(want, got);
  }
}