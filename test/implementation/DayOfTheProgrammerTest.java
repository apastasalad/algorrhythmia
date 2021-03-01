package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheProgrammerTest {

  @Test
  void dayOfProgrammerTestOne() {

    int testYear = 1800;
    String want = "12.09.1800";
    String got = DayOfTheProgrammer.dayOfProgrammer(testYear);

    Assertions.assertEquals(want, got);
  }

  @Test
  void dayOfProgrammerTestTwo() {

    int testYear = 2016;
    String want = "12.09.2016";
    String got = DayOfTheProgrammer.dayOfProgrammer(testYear);

    Assertions.assertEquals(want, got);
  }

  @Test
  void dayOfProgrammerTestThree() {

    int testYear = 2017;
    String want = "13.09.2017";
    String got = DayOfTheProgrammer.dayOfProgrammer(testYear);

    Assertions.assertEquals(want, got);
  }

  @Test
  void dayOfProgrammerTestFour() {

    int testYear = 1918;
    String want = "26.09.1918";
    String got = DayOfTheProgrammer.dayOfProgrammer(testYear);

    Assertions.assertEquals(want, got);
  }
}