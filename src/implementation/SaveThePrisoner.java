package implementation;

public class SaveThePrisoner {

  /**
   * @return the seat number where the last piece of  candy was distributed
   */
  static int saveThePrisoner(int numberOfPrisoners, int numberOfSweets, int startingSeat) {

    return ((numberOfSweets - 1) + (startingSeat - 1)) % numberOfPrisoners + 1;
  }
}
