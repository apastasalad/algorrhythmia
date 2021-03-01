package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberLineHopsTest {

  @Test
  void kangarooTestOne() {
    String want = "YES";
    String got = NumberLineHops.kangaroo(0, 3, 4, 2);

    Assertions.assertEquals(want, got);

  }

  @Test
  void kangarooTestTwo() {
    String want = "NO";
    String got = NumberLineHops.kangaroo(0, 2, 5, 3);

    Assertions.assertEquals(want, got);
  }
}