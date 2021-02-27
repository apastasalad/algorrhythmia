package implementation;

public class CountingValleys {

  /*
   * Count the Number of times the hiker goes below sea level, and returns.
   */
  public static int countingValleys(int steps, String path) {

    int SEA_LEVEL = 0;
    int valleyCounter = 0;
    int currentPosition = SEA_LEVEL;
    boolean inAValley = false;

    // look at each char in the String
    for (int i = 0; i < steps; i++) {
      char step = path.charAt(i);

      if (step == 'U') {
        currentPosition++;
      } else {
        currentPosition--;
      }

      // evaluate the position
      if (currentPosition < SEA_LEVEL) {
        inAValley = true;
      } else if ((currentPosition == SEA_LEVEL) && (inAValley)) {
        // I've just climbed out of a valley, so take note and reset my flag
        inAValley = false;
        valleyCounter++;
      }
    }

    return valleyCounter;
  }
}
