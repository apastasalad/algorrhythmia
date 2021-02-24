package warmup;

import java.util.List;

public class BirthdayCakeCandles {

  public static int birthdayCakeCandles(List<Integer> candles) {
    int maxCandleHeight = 0;
    int candleCount = 0;

    // look at the array
    for (Integer currentCandleHeight : candles) {
      // if the current candle is taller than the tallest candle, measure it
      if (currentCandleHeight > maxCandleHeight) {
        maxCandleHeight = currentCandleHeight;

        // reset the candle height
        candleCount = 1;
      } else if (currentCandleHeight == maxCandleHeight) {
        // count another candle at the max height
        candleCount++;
      }
    }

    return candleCount;
  }
}
