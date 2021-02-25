package implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BreakingTheRecordsTest {

  @Test
  void breakingRecordsTestOne() {
    int[] testScores = {10,5,20,20,4,5,2,25,1};
    int[] want = {2,4};
    int[] got = BreakingTheRecords.breakingRecords(testScores);

    Assertions.assertArrayEquals(want, got);
  }
}