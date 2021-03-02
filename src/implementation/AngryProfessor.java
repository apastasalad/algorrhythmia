package implementation;

public class AngryProfessor {

  // Is the class on today?
  static String angryProfessor(int k, int[] a) {

    int onTimeCounter = 0;

    // Look at the arrival times, count the number of on-time students.
    for (int arrivalTime : a) {
      if (arrivalTime <= 0) {
        onTimeCounter++;
      }
    }

    // is the class cancelled today
    if (onTimeCounter >= k) {
      return "NO"; // class is not cancelled
    } else {
      return "YES"; // class is cancelled
    }
  }
}
