package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElectronicsShopTest {

  @Test
  void getMoneySpentTestOne() {

    int[] testKeyboards = {4};
    int[] testUSBDrives = {5};
    int testBudget = 5;
    int want = -1;
    int got = ElectronicsShop.getMoneySpent(testKeyboards, testUSBDrives, testBudget);

    Assertions.assertEquals(want, got);
  }

  @Test
  void getMoneySpentTestTwo() {

    int[] testKeyboards = {3, 1};
    int[] testUSBDrives = {5, 2, 8};
    int testBudget = 10;
    int want = 9;
    int got = ElectronicsShop.getMoneySpent(testKeyboards, testUSBDrives, testBudget);

    Assertions.assertEquals(want, got);
  }
}