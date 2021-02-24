package warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AVeryBigSumTest {

  @Test
  void aVeryBigSum() {

    long[] testArray = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
    long want = 5000000015l;
    long got = AVeryBigSum.aVeryBigSum(testArray);

    Assertions.assertEquals(want, got);
  }
}