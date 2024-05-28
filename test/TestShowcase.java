import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestShowcase {

    SortowanieTablicy testSortowanieTablicy = new SortowanieTablicy();

    @Test
    public void addNumbersOfArrayTest() {
        int[] testArray = testSortowanieTablicy.testTab;
        int score = 0;
        for (int i = 0; i < testArray.length; i++) {
            score += testArray[i];
        }
        Assertions.assertEquals(9, score);
    }

    @Test
    public void addNumbersOfArrayNegativeNumbersTest() {
        int[] testArray = testSortowanieTablicy.testTab;
        int score = 0;
        for (int i = 0; i < testArray.length; i++) {
            score -= testArray[i];
        }
        Assertions.assertEquals(-9, score);
    }

    CountWordsInText testCountWordsInText = new CountWordsInText();

    @Test
    public void testEqualsAssertions() {
        String alaMaKota = "Ala ma kota, kota ma Ala";
        testCountWordsInText.countWords(alaMaKota);
        HashMap<String, Integer> predicted = new HashMap<>();
        predicted.put("ala", 2);
        predicted.put("ma", 2);
        predicted.put("kota", 2);

        Assertions.assertArrayEquals(new HashMap[]{predicted}, new HashMap[]{testCountWordsInText.countWords(alaMaKota)});
    }


    @Test
    public void checkStudentsListObjects(){

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(29,180,"Mati","Orzel"));
        studentList.add(new Student(23,160,"Adam","Bugdol"));
        studentList.add(new Student(24,170,"Sam","Hedi"));
        studentList.add(new Student(26,190,"Ben","Bob"));
        studentList.add(new Student(34,176,"Samanta","Kill"));
        studentList.add(new Student(32,187,"Walman","Kill"));

        ArrayList<Student> allStudents = new ArrayList<>(studentList);

        Assertions.assertArrayEquals(new ArrayList[]{studentList}, new ArrayList[]{allStudents}); // unsorted
    }


    @Test
    public void checkStudentsListObjectsNotAssert() {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(29, 180, "Mati", "Orzel"));
        studentList.add(new Student(23, 160, "Adam", "Bugdol"));
        studentList.add(new Student(24, 170, "Sam", "Hedi"));
        studentList.add(new Student(26, 190, "Ben", "Bob"));
        studentList.add(new Student(34, 176, "Samanta", "Kill"));
        studentList.add(new Student(32, 187, "Walman", "Kill"));

        ArrayList<Student> allStudents = new ArrayList<>(studentList);

        StudentsLastNameComparator studentsLastNameComparator = new StudentsLastNameComparator();

        studentList.sort(studentsLastNameComparator);
        studentList.equals(studentList);

        Assertions.assertNotEquals(new ArrayList[]{studentList}, new ArrayList[]{allStudents}); // sorted
    }
}
