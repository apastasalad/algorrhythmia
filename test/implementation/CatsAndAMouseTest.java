package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatsAndAMouseTest {

  @Test
  void catAndMouseTestOne() {

    String want = "Cat B";
    String got = CatsAndAMouse.catAndMouse(1, 2, 3);

    Assertions.assertEquals(want, got);
  }

  @Test
  void catAndMouseTestTwo() {

    String want = "Mouse C";
    String got = CatsAndAMouse.catAndMouse(1, 3, 2);

    Assertions.assertEquals(want, got);
  }
}