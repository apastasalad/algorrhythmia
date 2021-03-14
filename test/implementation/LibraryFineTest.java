package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LibraryFineTest {

  @Test
  void libraryFineTestOne() {

    int want = 45;
    int got = LibraryFine.libraryFine(9, 6, 2015, 6, 6, 2015);

    Assertions.assertEquals(want, got);
  }

  @Test
  void libraryFineTestTwo() {

    int want = 1500;
    int got = LibraryFine.libraryFine(5, 5, 2014, 23, 2, 2014);

    Assertions.assertEquals(want, got);
  }

  @Test
  void libraryFineEarlyReturn() {

    int want = 0;
    int got = LibraryFine.libraryFine(6, 6, 2015, 9, 6, 2015);

    Assertions.assertEquals(want, got);
  }

  @Test
  void libraryFineTestThree() {

    int want = 3000;
    int got = LibraryFine.libraryFine(2, 7, 1014, 1, 1, 1014);

    Assertions.assertEquals(want, got);
  }

  @Test
  void libraryFineTestFour() {

    int want = 10000;
    int got = LibraryFine.libraryFine(1, 1, 2015, 31, 12, 2014);

    Assertions.assertEquals(want, got);
  }
}