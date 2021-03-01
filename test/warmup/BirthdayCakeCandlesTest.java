package warmup;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BirthdayCakeCandlesTest {

  @Test
  void birthdayCakeCandles() {
    Integer[] testCandles = {3, 2, 1, 3};
    int want = 2;
    int got = BirthdayCakeCandles.birthdayCakeCandles(Arrays.asList(testCandles));

    Assertions.assertEquals(want, got);
  }
}