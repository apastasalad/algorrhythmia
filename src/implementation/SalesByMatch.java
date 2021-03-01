package implementation;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {

    Map<Integer, Integer> sockMap = new HashMap<>();
    int result = 0;

    // Sort all the socks
    for (int sock : ar) {
      // if we've already seen this sock before, increment the counter,
      // otherwise add a new sock
      if (sockMap.containsKey(sock)) {
        sockMap.put(sock, (sockMap.get(sock) + 1));
      } else {
        sockMap.put(sock, 1);
      }
    }

    // Count the pairs only
    for (Integer sock : sockMap.keySet()) {
      result+= sockMap.get(sock) / 2;
    }

    // Return the number of pairs
    return result;
  }
}
