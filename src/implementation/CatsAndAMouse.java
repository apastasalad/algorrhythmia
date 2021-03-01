package implementation;

public class CatsAndAMouse {

  static String catAndMouse(int x, int y, int z) {

    int catADistance = Math.abs(x - z);
    int catBDistance = Math.abs(y - z);

    if (catADistance < catBDistance) {
      return "Cat A";
    } else if (catBDistance < catADistance) {
      return "Cat B";
    } else {
      return "Mouse C";
    }
  }
}
