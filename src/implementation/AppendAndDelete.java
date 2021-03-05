package implementation;

import java.util.ArrayList;
import java.util.List;

public class AppendAndDelete {

  // Complete the appendAndDelete function below.
  static String appendAndDelete(String s, String t, int k) {

    // Can we completely delete and append a string in k movements
    if (s.length() + t.length() <= k) {
      return "Yes";
    }

    // find the largest substring, index will represent the
    // first non-matching character
    int i = 0;
    for (; i < s.length() && i < t.length(); i++) {
      if (s.charAt(i) != t.charAt(i)) {
        break;
      }
    }

    // the minimum number of items to delete and append
    //
    int operations = (s.length() - i) + (t.length() - i);
    if ((k == operations)) {
      return "Yes";
    } else {
      return "No";
    }
  }
}
