package implementation;

public class DayOfTheProgrammer {

  // Complete the dayOfProgrammer function below.
  static String dayOfProgrammer(int year) {

    int februaryDays;

    // Calculate the days in February
    //  1918 is special
    if (year == 1918) {
      februaryDays = 15;
    } else if (year < 1917) {
      // is this a leap year in the Gregorian Calendar?
      if (year % 4 == 0) {
        februaryDays = 29;
      } else {
        februaryDays = 28;
      }
    } else {
      // is this year a leap year in the Julian Calendar?
      // if the year is divisible by 400 **OR**
      // if the year is divisible by 4, but not by 100
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        februaryDays = 29;
      } else {
        februaryDays = 28;
      }
    }

    // The calendar days for the first 8 months
    int calendarDays = 31 + februaryDays + 31 + 30 + 31 + 30 + 31 + 31;
    int dayOfTheProgrammer = 256 - calendarDays;

    return dayOfTheProgrammer
        + "."
        + "09"
        + "."
        + year;
  }
}
