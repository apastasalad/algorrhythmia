package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeaderBoard {

  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    List<Integer> results = new ArrayList<>();
    List<Integer> rankedLeaderBoard = new ArrayList<>(ranked);

    for (int i = 0; i < player.size(); i++) {

      // add the new score. Use a set so that the index is the rank
      rankedLeaderBoard.add(player.get(i));
      Set<Integer> tempSet = new HashSet<>(rankedLeaderBoard);
      rankedLeaderBoard = new ArrayList<>(tempSet);

      // sort the array
      Collections.sort(rankedLeaderBoard, Collections.reverseOrder());

      // locate the rank and add it
      int index = Collections.binarySearch(rankedLeaderBoard, player.get(i), Collections.reverseOrder());
      results.add(index + 1);

      rankedLeaderBoard.remove(index);
    }

    return results;
  }
}
