package implementation;

public class DrawingBook {

  static int pageCount(int n, int p) {

    // are we already on the first or last page?
    if (n == p) {
      // early return
      return 0;
    }

    // count the pages from the beginning
    int frontPageCount = 0;
    for (int i = 1; i <= p; i += 2) {
      frontPageCount++;
    }

    // count the pages from the end
    int backPageCount = 0;
    int numPages = n;

    // If there's an even number of pages, then add one page turn
    if (numPages % 2 == 0) {
      numPages++;
    }

    // Are we already on the last page?
    if (numPages != (p+1)) {
      for (int i = numPages; i >= (p); i-=2) {
        backPageCount++;
      }
    } else {
      backPageCount = 0;
    }

    // return the lowest number of pages to turn
    return Math.min(frontPageCount, backPageCount);
  }
}
