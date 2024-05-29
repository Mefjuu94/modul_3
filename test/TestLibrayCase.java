import Libray.Libray;
import Libray.Author;
import Libray.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestLibrayCase {

    Libray libray = new Libray();
    Book b1 = new Book("Book of tests","Criminal",420);
    Book b2 = new Book("Disaster of programming","Comedy",1337);
    Author a1 = new Author("Test men",1990,"Horror");
    Author a2 = new Author("Test men also",1999,"Tragedy");
    Author a3 = new Author("Test men again Loco",1987,"Drama");

    @Test
    public void testGetBooksOfAuthor() {
        Author author = new Author("autor",1994,"Fantasy");

        libray.addAuthor(author);
        Assertions.assertEquals(author,libray.getAuthor("autor"));
    }

    @Test
    public void testAddBookToAuthor(){
        libray.addAuthor(a1);
        Assertions.assertTrue(libray.addBookToAuthor(a1.getName(), b1));
    }

    @Test
    public void testGetAllAuthors(){
        libray.addAuthor(a2);
        libray.addAuthor(a1);
        Set<Author> authorSet = new HashSet<>();
        authorSet.add(a1);
        authorSet.add(a2);

        Assertions.assertArrayEquals(authorSet.toArray(),libray.getAllAuthors().toArray());
    }

    @Test
    public void testGetAllBooksAndAuthors(){
        List<Book> b1List = new ArrayList<>();
        b1List.add(b1);
        List<Book> b2List = new ArrayList<>();
        b1List.add(b2);
        Map<Author, List<Book>> authorSet = new HashMap<>();
        authorSet.put(a1,b1List);
        authorSet.put(a2,b2List);

        libray.authorListMap.put(a1,b1List);
        libray.authorListMap.put(a2,b2List);

        Assertions.assertEquals(authorSet,libray.getAllBooksAndAuthors());
    }

    @Test
    public void testAddAuthor() {
        libray.addAuthor(a3);
        Map<Author,List<Book>> testSet = new HashMap<>();
        testSet.put(a3,new ArrayList<Book>());
        Assertions.assertEquals(testSet.get(a3),libray.getAuthor(a3.getName()));
    }


}
