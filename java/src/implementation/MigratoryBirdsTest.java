package implementation;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MigratoryBirdsTest {

  @Test
  void migratoryBirdsTestOne() {
    Integer[] testArray = {1, 4, 4, 4, 5, 3};
    int want = 4;
    int got = MigratoryBirds.migratoryBirds(Arrays.asList(testArray));

    Assertions.assertEquals(want, got);
  }

  @Test
  void migratoryBirdsTestTwo() {
    Integer[] testArray = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
    int want = 3;
    int got = MigratoryBirds.migratoryBirds(Arrays.asList(testArray));

    Assertions.assertEquals(want, got);
  }


}