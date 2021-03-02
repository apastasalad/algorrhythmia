package implementation;

public class ViralAdvertising {

  // Calculate the number of targets, assuming unique shares
  static int viralAdvertising(int n) {

    int liked;
    int shared = 5;
    int cumulative = 0;

    for (int i = 0; i < n; i++) {
      liked = Math.floorDiv(shared, 2);
      cumulative += liked;
      shared = liked * 3;
    }

    return cumulative;
  }
}
