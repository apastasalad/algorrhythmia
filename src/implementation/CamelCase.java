package implementation;

public class CamelCase {

  // Complete the camelcase function below.
  static int camelCase(String s) {

    int wordCounter = 1;

    for (char ch : s.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        wordCounter++;
      }
    }

    return wordCounter;
  }
}
