package implementation;

public class TheHurdleRace {

  // For a given height, and a number of hurdles, how many potions to take?
  static int hurdleRace(int k, int[] height) {

    int jumpHeight = k;
    int potionCounter = 0;

    for (int hurdleHeight : height) {
      if (hurdleHeight > jumpHeight) {
        // how many potions to take?
        int takeSomePotion = hurdleHeight - jumpHeight;
        potionCounter += takeSomePotion;
        jumpHeight += takeSomePotion;
      }
    }

    return potionCounter;
  }
}
