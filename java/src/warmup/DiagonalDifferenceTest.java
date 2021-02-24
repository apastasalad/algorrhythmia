package warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiagonalDifferenceTest {

    @Test
    void diagonalDifference() {

        // This is really ugly but I don't know how else to do it.
        List<List<Integer>> arr = new ArrayList<>();
        
        arr.add(0, Arrays.asList(new Integer[] {11,2,4}));
        arr.add(1, Arrays.asList(new Integer[] {4,5,6}));
        arr.add(2, Arrays.asList(new Integer[] {10,8,-12}));
        int want = 15;
        int got =  DiagonalDifference.diagonalDifference(arr);

        Assertions.assertEquals(want, got);
    }
}