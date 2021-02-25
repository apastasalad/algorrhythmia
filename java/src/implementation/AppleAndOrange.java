package implementation;

public class AppleAndOrange {


  /**
   * are there oranges on the house?
   */
  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    // Print the result
    System.out.println(howManyApplesOnDaHouse(s, t, a, apples));
    System.out.println(howManyOrangesOnDaHouse(s, t, b, oranges));
  }

  /**
   * How many apples are on the house?
   */
  static int howManyApplesOnDaHouse(int s, int t, int a, int[] apples) {

    int applesOnDaHouse = 0;

    // Calculate the fallen orange and apple coordinates.
    // Test if they fall on the house and keep trace
    for (int apple : apples) {
      int appleCoord = a + apple;
      if ((appleCoord >= s) && (appleCoord <= t)) {
        applesOnDaHouse++;
      }
    }

    return applesOnDaHouse;
  }

  static int howManyOrangesOnDaHouse(int s, int t, int b, int[] oranges) {
    int orangesOnDaHouse = 0;

    for (int orange : oranges) {
      int orangeCoord = b + orange;
      if ((orangeCoord >= s) && (orangeCoord <= t)) {
        orangesOnDaHouse++;
      }
    }
    return orangesOnDaHouse;
  }
}
