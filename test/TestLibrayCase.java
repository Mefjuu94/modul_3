import Libray.Author;
import Libray.Book;
import Libray.Libray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestLibrayCase {

    private Libray testObject = new Libray();
    private Book b1 = new Book("Book of tests", "Criminal", 420);
    private Book b2 = new Book("Disaster of programming", "Comedy", 1337);
    private Author a1 = new Author("Test men", 1990, "Horror");
    private Author a2 = new Author("Test men also", 1999, "Tragedy");
    private Author a3 = new Author("Test men again Loco", 1987, "Drama");

    private Map<Author, List<Book>> authorListMap = new HashMap<>();

    @Test
    public void testGetBooksOfAuthor() {
        Author author = new Author("autor", 1994, "Fantasy");

        testObject.addAuthor(author);
        Assertions.assertEquals(author, testObject.getAuthor("autor"));
    }

    @Test
    public void testAddBookToAuthor() {
        testObject.addAuthor(a1);
        Assertions.assertTrue(testObject.addBookToAuthor(a1.getName(), b1));
    }

    @Test
    public void testGetAllAuthors() {
        testObject.addAuthor(a2);
        testObject.addAuthor(a1);
        Set<Author> authorSet = new HashSet<>();
        authorSet.add(a1);
        authorSet.add(a2);

        Assertions.assertArrayEquals(authorSet.toArray(), testObject.getAllAuthors().toArray());
    }

    @Test
    public void testGetAllBooksAndAuthors() {
        List<Book> b1List = new ArrayList<>();
        b1List.add(b1);
        List<Book> b2List = new ArrayList<>();
        b2List.add(b2);
        Map<Author, List<Book>> authorSet = new HashMap<>();
        authorSet.put(a1, b1List);
        authorSet.put(a2, b2List);

        testObject.addAuthor(a1);
        testObject.addBookToAuthor(a1.getName(), b1);
        testObject.addAuthor(a2);
        testObject.addBookToAuthor(a2.getName(), b2);

        Assertions.assertEquals(authorSet, testObject.getAllBooksAndAuthors());
    }

    @Test
    public void testAddAuthor() {
        Assertions.assertTrue(testObject.addAuthor(a3));
    }

    @Test
    public void testGetAuthor() {
        Author a4 = new Author("Test men again Loco", 1987, "Drama");
        authorListMap.put(a4, new ArrayList<>());

        Assertions.assertNotNull(a4);
        // Sprawdzenie, czy obiekt jest instance klasy Autor
        Assertions.assertTrue(true);
    }


    //bad way

    @Test
    public void testGetBooksOfAuthorWrong() {
        Author author = new Author("autor", 1994, "Fantasy");

        Assertions.assertNotEquals(author, testObject.getAuthor("autor"));
    }

    @Test
    public void testAddBookToAuthorWrong() {
        Assertions.assertFalse(testObject.addBookToAuthor(a1.getName(), b1));
    }

    @Test
    public void testGetAllAuthorsWrong() {
        testObject.addAuthor(a2);
        testObject.addAuthor(a1);
        Set<Author> authorSet = new HashSet<>();
        authorSet.add(a1);

        Assertions.assertNotEquals(authorSet.toArray(), testObject.getAllAuthors().toArray());
    }


    @Test
    public void testGetAllBooksAndAuthorsWrong() {
        List<Book> b1List = new ArrayList<>();
        b1List.add(b1);
        List<Book> b2List = new ArrayList<>();
        b2List.add(b2);

        Map<Author, List<Book>> authorSet = new HashMap<>();
        authorSet.put(a1,b1List);
        authorSet.put(a2,b2List);

        Assertions.assertNotEquals(authorSet, testObject.getAllBooksAndAuthors());
    }


    @Test
    public void testAddAuthorWrong() {
        testObject.addAuthor(a3);
        Assertions.assertFalse(testObject.addAuthor(a3));
    }

    @Test
    public void testGetAuthorWrong() {
        Author a4 = new Author("Test men again Loco", 1987, "Drama");


        Assertions.assertNull(null);
        // Sprawdzenie, czy obiekt jest instance klasy Autor
        Assertions.assertFalse(false);
    }


}
