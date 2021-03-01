package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicsShop {

  /*
   * Determine which keyboard and usb drive money can buy
   */
  static int getMoneySpent(int[] keyboards, int[] drives, int b) {

    List<Integer> combinations = new ArrayList<>();

    // populate all the purchase combinations with their combined cost;
    for (int keyboard : keyboards) {
      for (int drive : drives) {
        if (b - keyboard - drive >= 0) {
          combinations.add(keyboard + drive);
        }
      }
    }

    // if there are no combinations, then return -1, otherwise return the most expensive combination
    // that can be bought.
    if (combinations.isEmpty()) {
      return -1;
    } else {
      return Collections.max(combinations);
    }
  }
}
