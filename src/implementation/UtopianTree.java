package implementation;

public class UtopianTree {

  /**
   * Return the height after n cycles of growth.
   */
  static int utopianTree(int n) {

    int currentHeight = 1;

    // no cycles to calculate, so return early.
    if (n == 0) {
      return currentHeight;
    }

    // If there is one cycle, then return early.
    if (n == 1) {
      return currentHeight * 2;
    }

    // Even cycles vs Odd cycles
    if (n % 2 == 0) {

      // An even cycle consists of Spring and Summer
      for (int i = 0; i < n / 2; i++) {
        // Spring
        currentHeight = currentHeight * 2;

        // Summer
        currentHeight++;
      }
    } else {
      // An odd cycle will have one final Spring cycle on the end
      for (int i = 0; i < n / 2; i++) {
        // Spring
        currentHeight = currentHeight * 2;

        // Summer
        currentHeight++;
      }

      // One last Spring cycle
      currentHeight = currentHeight * 2;
    }
    return currentHeight;
  }
}
