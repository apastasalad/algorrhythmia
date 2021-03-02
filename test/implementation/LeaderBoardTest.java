package implementation;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeaderBoardTest {

  @Test
  void climbingLeaderboardTestOne() {
    Integer[] testRanks = {100, 100, 50, 40, 40, 20, 10};
    Integer[] scores = {5, 25, 50, 120};
    List<Integer> want = Arrays.asList(6, 4, 2, 1);
    List<Integer> got = LeaderBoard.climbingLeaderboard(Arrays.asList(testRanks), Arrays.asList(scores));

    Assertions.assertEquals(want, got);
  }
}