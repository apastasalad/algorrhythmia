package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GradingStudents {

    // Every student receives a grade in the inclusive range from 0 to 100 .
    // Any grade less than 40 is a failing grade.
    //
    // If the difference between the grade and the next multiple of 5 is less than 3, round the grade up to the next multiple of 5.
    // If the value of grade is less than 38 , no rounding occurs as the result will still be a failing grade.
    public static List<Integer> gradingStudents(List<Integer> grades) {

        Iterator gradesItr = grades.iterator();
        List <Integer> returnedGrades = new ArrayList();
        int grade;

        while (gradesItr.hasNext()) {

            grade = (Integer) gradesItr.next();

            // must divide by a double in order to get a remainder
            double division = grade / 5.0;

            // convert to a String to allow us to quickly check the remainder.
            String modulus = String.valueOf(division);

            if (grade < 37) {
                // do nothing
                returnedGrades.add(grade);
            }
            else if (modulus.contains(".6")) {
                // round up to the nearest '5'
                returnedGrades.add(grade + 2);
            }
            else if (modulus.contains(".8")) {
                // round up to the nearest '5'
                returnedGrades.add(grade + 1);
            }
            else {
                // do nothing
                returnedGrades.add(grade);
            }
        }

        return returnedGrades;
    }


}
