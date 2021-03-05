package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

  @Test
  void isRomanNumeralTestOne() {
    boolean got = RomanNumerals.isRomanNumeral("XVI");
    Assertions.assertTrue(got);
  }

  void isRomanNumeralTestTwo() {
    boolean got = RomanNumerals.isRomanNumeral("XVIC");
    Assertions.assertFalse(got);
  }
}