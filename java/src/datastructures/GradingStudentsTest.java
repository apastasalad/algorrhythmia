package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GradingStudentsTest {

  @Test
  void gradingStudents() {
    Integer[] gradesArr = {73, 67, 38, 33};
    Integer[] wantGradesArr = {75, 67, 40, 33};
    List<Integer> testGrades = new ArrayList<>();
    List<Integer> wantGrades = new ArrayList<>();

    Collections.addAll(testGrades, gradesArr);
    Collections.addAll(wantGrades, wantGradesArr);
    List<Integer> gotGrades = GradingStudents.gradingStudents(testGrades);

    Assertions.assertEquals(wantGrades, gotGrades);
  }
}