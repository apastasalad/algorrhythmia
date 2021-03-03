package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CamelCaseTest {

  @Test
  void camelCaseTestOne() {

    String testString = "oneTwoThreeFourFiveSix";
    int want = 6;
    int got = CamelCase.camelCase(testString);

    Assertions.assertEquals(want, got);
  }

  @Test
  void camelCaseTestTwo() {

    String testString = "saveChangesInTheEditor";
    int want = 5;
    int got = CamelCase.camelCase(testString);

    Assertions.assertEquals(want, got);
  }
}