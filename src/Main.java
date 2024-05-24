import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SortowanieTablicy zad1 = new SortowanieTablicy();

        System.out.println("--------------------");

        TodoList todoList = new TodoList();

        todoList.add("zrobić kawę");
        todoList.add("zjeść śniadanie");
        todoList.add("umyć naczynia");
        todoList.add("pracka pracka x 8h");
        todoList.add("nauka");
        todoList.add("spanko");

        todoList.print();

        todoList.remove(3);


        System.out.println("--działanie--");

        todoList.print();

        System.out.println("--------------------");

        CountWordsInText countWordsInText = new CountWordsInText();
        System.out.println(countWordsInText.countWords(countWordsInText.text));

        System.out.println("--------------------");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(29,180,"Mati","Orzel"));
        studentList.add(new Student(23,160,"Adam","Bugdol"));
        studentList.add(new Student(24,170,"Sam","Bob"));
        studentList.add(new Student(26,190,"Ben","Bob"));
        studentList.add(new Student(34,176,"Samanta","Kill"));

        System.out.println(studentList);
        StudentsLastNameComparator studentsLastNameComparator = new StudentsLastNameComparator();

        studentList.sort(studentsLastNameComparator);

        System.out.println(studentList);



    }
}