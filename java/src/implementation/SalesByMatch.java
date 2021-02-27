package implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SalesByMatch {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {

    Map<Integer, Integer> sockMap = new HashMap<>();
    int result = 0;

    // Sort all the socks

    // Count the pairs only
    Iterator sockItr = sockMap.entrySet().iterator();
    while (sockItr.hasNext()) {
      if (((Integer) sockItr.next()) % 2 == 0) {
        result++;
      }
    }

    // Return the number of pairs
    return result;
  }
}
