package implementation;

public class BreakingTheRecords {

  /**
   * Count the number of times we break a record. The first score doesn't count towards a
   * record breaking entry, but creates a baseline instead.
   */
  static int[] breakingRecords(int[] scores) {

    int highestScore = scores[0];
    int lowestScore = scores[0];
    int highestRecordCounter = 0;
    int lowestRecordCounter = 0;

    for (int score : scores) {
      if (score > highestScore) {
        highestRecordCounter++;
        highestScore = score;
      } else if (score < lowestScore) {
        lowestRecordCounter++;
        lowestScore = score;
      }
    }

    return new int[]{highestRecordCounter, lowestRecordCounter};
  }

}
