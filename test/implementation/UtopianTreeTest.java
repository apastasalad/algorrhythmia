package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtopianTreeTest {

  @Test
  void utopianTreeTestOne() {
    int want = 1;
    int got = UtopianTree.utopianTree(0);

    Assertions.assertEquals(want, got);
  }

  @Test
  void utopianTreeTestTwo() {
    int want = 2;
    int got = UtopianTree.utopianTree(1);

    Assertions.assertEquals(want, got);
  }

  @Test
  void utopianTreeTestThree() {
    int want = 7;
    int got = UtopianTree.utopianTree(4);

    Assertions.assertEquals(want, got);
  }
}