package implementation;

public class BeautifulDays {


  // Complete the beautifulDays function below.
  static int beautifulDays(int i, int j, int k) {

    int reversedDay;
    int beautifulDayCounter = 0;
    for (int a = i; a <= j; a++) {

      reversedDay = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());

      if (Math.abs(a - reversedDay) % k == 0) {
        beautifulDayCounter++;
      }
    }

    return beautifulDayCounter;
  }
}
