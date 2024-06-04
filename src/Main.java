import java.util.*;

import Libray.*;

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


        System.out.println("--To do after remove--");

        todoList.print();

        System.out.println("--------------------");

        CountWordsInText countWordsInText = new CountWordsInText();
        System.out.println(countWordsInText.countWords(countWordsInText.text));
        String testString = "test text is a test text, nothing can Happen. This should pass.";
        System.out.println(countWordsInText.countWords(testString));

        System.out.println("-------students -------------");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(29,180,"Mati","Orzel"));
        studentList.add(new Student(23,160,"Adam","Bugdol"));
        studentList.add(new Student(24,170,"Sam","Hedi"));
        studentList.add(new Student(26,190,"Ben","Bob"));
        studentList.add(new Student(34,176,"Samanta","Kill"));
        studentList.add(new Student(32,187,"Walman","Kill"));


        for (Student student : studentList) {
            System.out.println(student);
        }
        StudentsLastNameComparator studentsLastNameComparator = new StudentsLastNameComparator();

        studentList.sort(studentsLastNameComparator);
        Collections.sort(studentList,studentsLastNameComparator);
//        studentList.equals(studentList);

        System.out.println("-------students after sort:-------------");

        for (Student student : studentList) {
        System.out.println(student);
        }


        System.out.println("--------------------");

        Libray libray = new Libray();

        libray.dzialaj(); // test drive

        //books of autor:
        System.out.println(libray.getBooksOfAuthor("Joanne Rowling")); // search books of JK ROWLING

        ///////////////////////create author 2 and books /////////////////////////
        Author a2 = new Author("Nicholas Sparks",1965,"Criminal");
        libray.addAuthor(a2);

        Book b4 = new Book("Counting Miracles","Literature",368); //create book
        libray.addBookToAuthor("Nicholas Sparks",b4);                           //add book
        Book b5 = new Book("Pamiętnik","Romance",256);
        libray.addBookToAuthor("Nicholas Sparks",b5);
        Book b6 = new Book("Wedding","Romance",272);
        libray.addBookToAuthor("Nicholas Sparks",b6);

        ///////////////////////author 3/////////////////////////
        Author a3 = new Author("JGeorge R.R. Martin",1948,"Fantasy");
        libray.addAuthor(a3);

        Book b11 = new Book("Dirty Games","Fantasy",700);
        libray.addBookToAuthor("JGeorge R.R. Martin",b11);
        Book b22 = new Book("Game of Thrones","Fantasy",844);
        libray.addBookToAuthor("JGeorge R.R. Martin",b22);
        Book b33 = new Book("The Hedge Knight","Fantasy",277);
        libray.addBookToAuthor("JGeorge R.R. Martin",b33);

        ///////////////////////author 4/////////////////////////
        Author a4 = new Author("Remigiusz Mróz",1987,"Criminal");
        Book b55 = new Book("Ekspozycja","Fantasy",474);
        libray.addBookToAuthor("Remigiusz Mróz",b55);

        ///////////////////////author 5/////////////////////////
        Author a5 = new Author("Stephen King",77,"Fantasy");


        System.out.println("--------authors: ");
        System.out.println(libray.getAllAuthors()); // show all authors
        System.out.println("--------all Books List: ");
        System.out.println(libray.getAllBooksList());
        System.out.println("--------all Books and Authors: ");
        System.out.println(libray.getAllBooksAndAuthors());


        countWordsInText.countWords("  " +
                "");



    }
}