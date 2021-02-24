package warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleArraySumTest {

  @Test
  void simpleArraySum() {
    // 1 2 3 4 10 11
    int[] testArray = {1, 2, 3, 4, 10, 11};
    Assertions.assertEquals(SimpleArraySum.simpleArraySum(testArray), 31);
  }
}