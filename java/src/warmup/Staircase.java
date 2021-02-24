package warmup;

public class Staircase {

  // Create a staircase
  static void staircase(int n) {

    int spaceCounter = n - 1;
    int stepCounter = 1;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      // Print the spaces
      for (int j = 0; j < spaceCounter; j++) {
        sb.append(" ");
      }

      // Print the hashes
      for (int k = 0; k < stepCounter; k++) {
        sb.append("#");
      }

      // add a newline, and calculate the next step
      sb.append(System.getProperty("line.separator"));

      spaceCounter--;
      stepCounter++;
    }
    System.out.println(sb.toString());
  }
}
