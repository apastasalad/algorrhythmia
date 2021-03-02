package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeaderBoard {

  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

    List<Integer> results = new ArrayList<>();

    for (int i = 0; i < player.size(); i++) {

      // clear everything and begin
      int rankCounter = 1;
      boolean found = false;
      Integer[] rankedLeaderBoard = {};

      // add all the current scores to the array
      rankedLeaderBoard = ranked.toArray(rankedLeaderBoard);

      // add the new score and sort the array
      rankedLeaderBoard = Arrays.copyOf(rankedLeaderBoard, rankedLeaderBoard.length + 1);
      rankedLeaderBoard[rankedLeaderBoard.length - 1] = player.get(i);
      Arrays.sort(rankedLeaderBoard, Collections.reverseOrder());

      // Element 0 is a special case. Is the player rank 1?
      // if yes, then break
      if (rankedLeaderBoard[0] == player.get(i)) {
        results.add(1);
      } else {
        // Inspect all the remaining scores and allocate ranks starting from element 1
        for (int j = 1; j < rankedLeaderBoard.length; j++) {
          // Compare the score with the previous
          // if the scores is less, than this is a new rank
          if (rankedLeaderBoard[j] < rankedLeaderBoard[j - 1]) {
            rankCounter++;
          }

          // is this a rank we care about?
          if ((rankedLeaderBoard[j] == player.get(i)) && !found) {
            results.add(rankCounter);
            found = true;
          }
        }
      }
    }

    return results;
  }
}
