package implementation;

public class DrawingBook {

  /**
   * Count the number of pages turns
   */
  static int pageCount(int n, int p) {

    int totalPageTurnCountFromFront = n / 2;
    int targetPageTurnCountFromFront = p / 2;
    int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

    return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
  }
}
