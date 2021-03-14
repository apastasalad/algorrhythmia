package implementation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryFine {

  // Complete the libraryFine function below.
  static int libraryFine(int returnedDay, int returnedMonth, int returnedYear, int dueDay, int dueMonth, int dueYear) {

    LocalDate returnedDate = LocalDate.of(returnedYear, returnedMonth, returnedDay);
    LocalDate dueDate = LocalDate.of(dueYear, dueMonth, dueDay);

    int days = (int) ChronoUnit.DAYS.between(dueDate, returnedDate);

    // If there is no fine, then exit
    if (days < 0) {
      return 0;
    }

    // If there is a fine for a year, then exit
    if (returnedYear - dueYear > 0) {
      return 10000;
    }

    // If there is a fine for a month, then exit,
    // or else calculate the fine for the number of days
    if (ChronoUnit.MONTHS.between(dueDate, returnedDate) >= 1) {

      return (returnedMonth - dueMonth) * 500;
    } else {

      return days * 15;

    }
  }
}
