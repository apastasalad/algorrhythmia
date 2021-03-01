package warmup;

import java.util.StringTokenizer;

public class TimeConversion {

  /*
   * Complete the timeConversion function below.
   */
  static String timeConversion(String s) {
    StringBuilder sb = new StringBuilder();

    // tokenize and remove the AM / PM field
    String trimmedString = s.substring(0, s.length() - 2);
    StringTokenizer st = new StringTokenizer(trimmedString, ":");

    // Collect the time elements.
    String hours = st.nextToken();
    String minutes = st.nextToken();
    String seconds = st.nextToken();

    // Look at the hours field
    if (s.contains("AM")) {
      if (hours.equals("12")) {
        // 12AM is a special case
        sb.append("00");
      } else {
        sb.append(hours);
      }
    } else {
      if (hours.equals("12")) {
        // 12PM is also special case
        sb.append("12");
      } else {
        sb.append(Integer.parseInt(hours) + 12);
      }
    }

    // Add the minutes field
    sb.append(":");
    sb.append(minutes);
    sb.append(":");

    // Add the seconds field
    sb.append(seconds);

    return sb.toString();
  }
}
