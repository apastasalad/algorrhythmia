package implementation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LeaderBoard {


  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

    // Use a LinkedHashSet to maintain an ordered set.
    Set<Integer> tempSet = new LinkedHashSet<>(ranked);
    List<Integer> rankedLeaderBoard = new ArrayList<>(tempSet);
    List<Integer> results = new LinkedList<>();

    // start with a rank beyond the dimensions of the set
    int rank = rankedLeaderBoard.size() + 1;

    // Work from the end to the beginning looking for the correct rank location.
    for (Integer i : player) {
      for (int j = rank - 2; j >= 0; j--) {
        if (i < rankedLeaderBoard.get(j)) {         // the score is < than the next leaderboard score
          break;
        } else if (i.equals(rankedLeaderBoard.get(j))) { // the score is = to the leaderboard score
          rank--;
          break;
        } else {                                    // the score is > the leaderboard score
          rank--;
        }
      }
      results.add(rank);
    }
    return results;
  }
}
