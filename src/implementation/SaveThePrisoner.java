package implementation;

public class SaveThePrisoner {

  /**
   * @return the seat number where the last piece of  candy was distributed
   */
  static int saveThePrisoner(int numberOfPrisoners, int numberOfSweets, int startingSeat) {

    int seatCounter = startingSeat;

    // distribute the candy
    for (int i = 1; i < numberOfSweets; i++) {

      // once we arrive at the highest number chair, begin again
      if (seatCounter + 1 > numberOfPrisoners) {
        seatCounter = 1;
      } else {
        seatCounter++;
      }
    }

    return seatCounter;
  }
}
