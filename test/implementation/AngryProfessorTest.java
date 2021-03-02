package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AngryProfessorTest {

  @Test
  void angryProfessorTestOne() {

    int[] testArray = {-1, -3, 4, 2};
    String want = "YES";
    String got = AngryProfessor.angryProfessor(3, testArray);
    Assertions.assertEquals(want, got);
  }

  @Test
  void angryProfessorTestTwo() {

    int[] testArray = {0, -1, 2, 1};
    String want = "NO";
    String got = AngryProfessor.angryProfessor(2, testArray);
    Assertions.assertEquals(want, got);
  }


}