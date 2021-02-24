package warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import warmup.TimeConversion;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void timeConversionTestOne() {

        String testTime = "07:05:45PM";
        String want = "19:05:45";
        String got = TimeConversion.timeConversion(testTime);

        Assertions.assertEquals(want, got);
    }

    @Test
    void timeConversionTestTwo() {

        String testTime = "12:40:22AM";
        String want = "00:40:22";
        String got = TimeConversion.timeConversion(testTime);

        Assertions.assertEquals(want, got);
    }

    @Test
    void timeConversionTestThree() {

        String testTime = "12:45:54PM";
        String want = "12:45:54";
        String got = TimeConversion.timeConversion(testTime);

        Assertions.assertEquals(want, got);
    }




}