package implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

  // Complete the migratoryBirds function below.
  static int migratoryBirds(List<Integer> arr) {

    // Store the birds as key/value pairs, indexed by Bird Type.
    Map<Integer, Integer> allTheBirds = new HashMap<>();

    // populate the HashMap with the birds we see
    for (int bird : arr) {
      // if we have already added this bird, increment the counter
      // otherwise, record the first sighting.
      if (allTheBirds.containsKey(bird)) {
        allTheBirds.put(bird, allTheBirds.get(bird) + 1);
      } else {
        allTheBirds.put(bird, 1);
      }
    }

    // find those birds.
    // look through the bird tallies and find the highest entry, using the comparator
    // to give the lowest value bird type / key. Return the key
    return Collections.max(allTheBirds.entrySet(), Map.Entry.comparingByValue()).getKey();
  }

}
