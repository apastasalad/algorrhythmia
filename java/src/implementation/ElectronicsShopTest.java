package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElectronicsShopTest {

  @Test
  void getMoneySpentTestOne() {

    int[] testKeyboards = {};
    int[] testUSBDrives = {};
    int testBudget = 0;
    int want = 0;
    int got = ElectronicsShop.getMoneySpent(testKeyboards, testUSBDrives, testBudget);

    Assertions.assertEquals(want, got);
  }
}