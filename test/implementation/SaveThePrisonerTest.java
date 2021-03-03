package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SaveThePrisonerTest {

  @Test
  void saveThePrisonerTestOne() {
    int want = 2;
    int got = SaveThePrisoner.saveThePrisoner(5, 2, 1);

    Assertions.assertEquals(want, got);
  }

  @Test
  void saveThePrisonerTestTwo() {
    int want = 3;
    int got = SaveThePrisoner.saveThePrisoner(5, 2, 2);

    Assertions.assertEquals(want, got);
  }
}