package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SalesByMatchTest {

  @Test
  void sockMerchantTestOne() {
    int[] testArray = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    int want = 3;
    int got = SalesByMatch.sockMerchant(testArray.length, testArray);

    Assertions.assertEquals(want, got);
  }

  @Test
  void sockMerchantTestTwo() {
    int[] testArray = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
    int want = 4;
    int got = SalesByMatch.sockMerchant(testArray.length, testArray);

    Assertions.assertEquals(want, got);
  }
}