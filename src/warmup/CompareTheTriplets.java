package warmup;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompareTheTriplets {


  // If a[i] > b[i], then Alice is awarded 1 point.
  // If a[i] < b[i], then Bob is awarded 1 point.
  // If a[i] = b[i], then neither person receives a point.
  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    Iterator scoreAItr = a.iterator();
    Iterator scoreBItr = b.iterator();

    Integer[] results = {0, 0};

    while (scoreAItr.hasNext() && scoreBItr.hasNext()) {

      // Get the scores
      Integer scoreA = (Integer) scoreAItr.next();
      Integer scoreB = (Integer) scoreBItr.next();

      // Inspect the scores
      if (scoreA > scoreB) {
        results[0] += 1;
      } else if (scoreA < scoreB) {
        results[1] += 1;
      } else if (scoreA.equals(scoreB)) {
        // tie, so do nothing
      } else {
        // catch anything else and do nothing
      }
    }

    return Arrays.asList(results);
  }
}
