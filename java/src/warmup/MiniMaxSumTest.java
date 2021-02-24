package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniMaxSumTest {

    @Test
    void miniMaxSumTest1() {
        int[] testArray = {1,3,5,7,9};
        MiniMaxSum.miniMaxSum(testArray);
    }

    @Test
    void miniMaxSumTest2() {
        int[] testArray = {256741038, 623958417, 467905213, 714532089, 938071625};
        MiniMaxSum.miniMaxSum(testArray);
    }

    @Test
    void miniMaxSumTest3() {
        int[] testArray = {769082435, 210437958, 673982045, 375809214, 380564127};
        MiniMaxSum.miniMaxSum(testArray);
    }

    @Test
    void miniMaxSumTest4() {
        int[] testArray = {942381765, 627450398, 954173620, 583762094, 236817490};
        MiniMaxSum.miniMaxSum(testArray);
    }
}


