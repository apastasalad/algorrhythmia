package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiagonalDifferenceTest {

  @Test
  void diagonalDifference() {

    // This is really ugly but I don't know how else to do it.
    List<List<Integer>> arr = new ArrayList<>();
    arr.add(0, Arrays.asList(11, 2, 4));
    arr.add(1, Arrays.asList(4, 5, 6));
    arr.add(2, Arrays.asList(10, 8, -12));

    int want = 15;
    int got = DiagonalDifference.diagonalDifference(arr);

    Assertions.assertEquals(want, got);
  }
}