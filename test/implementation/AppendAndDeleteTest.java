package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppendAndDeleteTest {

  @Test
  void appendAndDeleteTestOne() {
    String intialString = "hackerhappy";
    String targetString = "hackerrank";
    String got = AppendAndDelete.appendAndDelete(intialString, targetString, 9);

    Assertions.assertEquals("Yes", got);
  }

  @Test
  void appendAndDeleteTestTwo() {
    String intialString = "aba";
    String targetString = "aba";
    String got = AppendAndDelete.appendAndDelete(intialString, targetString, 7);

    Assertions.assertEquals("Yes", got);
  }

  @Test
  void appendAndDeleteTestThree() {
    String intialString = "ashley";
    String targetString = "ash";
    String got = AppendAndDelete.appendAndDelete(intialString, targetString, 2);

    Assertions.assertEquals("No", got);
  }

  @Test
  void appendAndDeleteTestFour() {
    String intialString = "qwerasdf";
    String targetString = "qwerbsdf";
    String got = AppendAndDelete.appendAndDelete(intialString, targetString, 6);

    Assertions.assertEquals("No", got);
  }

  @Test
  void appendAndDeleteTestFive() {
    String intialString = "y";
    String targetString = "yu";
    String got = AppendAndDelete.appendAndDelete(intialString, targetString, 2);

    Assertions.assertEquals("No", got);
  }
}