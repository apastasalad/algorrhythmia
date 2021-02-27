package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DrawingBookTest {

  @Test
  void pageCountTestOne() {
    int want = 1;
    int got = DrawingBook.pageCount(6,2);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestTwo() {
    int want = 0;
    int got = DrawingBook.pageCount(5,4);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestThree() {
    int want = 0;
    int got = DrawingBook.pageCount(5,5);
    Assertions.assertEquals(want, got);
  }
}