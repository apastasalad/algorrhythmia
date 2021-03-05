package implementation;

public class AppendAndDelete {

  // Complete the appendAndDelete function below.
  static String appendAndDelete(String s, String t, int k) {

    // Can we completely delete and append a string in k movements
    if (s.length() + t.length() <= k) {
      return "Yes";
    }

    // locate the first character where the substring does not patch.
    int i = 0;
    for (; i < s.length() && i < t.length(); i++) {
      if (s.charAt(i) != t.charAt(i)) {
        break;
      }
    }

    // calculate the minimum operations required.
    int minimumMoves;
    if (k % 2 == (s.length() + t.length()) % 2) {
      minimumMoves = (s.length() - i) + (t.length() - i);
    } else {
      minimumMoves = s.length() + t.length() + 1;
    }

    if (minimumMoves <= k) {
      return "Yes";
    } else {
      return "No";
    }
  }
}
