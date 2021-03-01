package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DrawingBookTest {

  @Test
  void pageCountTestOne() {
    int want = 1;
    int got = DrawingBook.pageCount(6, 2);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestTwo() {
    int want = 0;
    int got = DrawingBook.pageCount(5, 4);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestThree() {
    int want = 0;
    int got = DrawingBook.pageCount(5, 5);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestFour() {
    int want = 0;
    int got = DrawingBook.pageCount(5, 1);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestFive() {
    int want = 1;
    int got = DrawingBook.pageCount(7, 3);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestSix() {
    int want = 0;
    int got = DrawingBook.pageCount(5, 4);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestSeven() {
    int want = 1;
    int got = DrawingBook.pageCount(7, 4);
    Assertions.assertEquals(want, got);
  }

  @Test
  void pageCountTestEight() {
    int want = 8720;
    int got = DrawingBook.pageCount(95073, 17440);
    Assertions.assertEquals(want, got);
  }
}