package implementation;

public class NumberLineHops {

  /** Will the Kangaroos ever meet? */
  static String kangaroo(int x1, int v1, int x2, int v2) {

    int kangaroo1pos = x1;
    int kangaroo2pos = x2;

    String result = "NO";

    // after each hop, compare the locations
    for (int i = 0; i < 10000; i++) {
      kangaroo1pos += v1;
      kangaroo2pos += v2;

      if (kangaroo1pos == kangaroo2pos) {
        result = "YES";
        break;
      }
    }

    return result;
  }
}
