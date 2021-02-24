package warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CompareTheTripletsTest {

    @Test
    void compareTriplets() {

        Integer[] aScores = {5,6,7};
        Integer[] bScores = {3,6,10};
        Integer[] result = {1,1};

        Assertions.assertEquals(CompareTheTriplets.compareTriplets(Arrays.asList(aScores),Arrays.asList(bScores)), Arrays.asList(result));
    }
}