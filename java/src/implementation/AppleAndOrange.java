package implementation;

public class AppleAndOrange {


  /** are there oranges on the house? */
  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

    // On da house
    int applesOnDaHouse = 0;
    int orangesOnDaHouse =0;

    // Calculate the fallen orange and apple coordinates.
    // Test if they fall on the house and keep trace
    for (int apple : apples) {
      int appleCoord = a + apple;
      if ((appleCoord >= s) && (appleCoord <= t)) {
        applesOnDaHouse++;
      }
    }

    for (int orange : oranges) {
      int orangeCoord = b + orange;
      if ((orangeCoord >= s) && (orangeCoord <= t)) {
        orangesOnDaHouse++;
      }
    }

    // Print the result
    System.out.println(applesOnDaHouse);
    System.out.println(orangesOnDaHouse);
  }
}
