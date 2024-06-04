package Libray;

import java.util.*;

public class Libray {

    private Map<Author, List<Book>> authorListMap = new HashMap<>();

    public void dzialaj() {

        // add rowling with books automaticly
        Author a1 = new Author("Joanne Rowling", 1965, "Fantasy");

        Book b1 = new Book("Harry Potter i Kamień Filozoficzny", "Fantasy", 320);
        addBookToAuthor("Joanne Rowling", b1);
        Book b2 = new Book("Harry Potter i więzień Azkabanu", "Fantasy", 456);
        addBookToAuthor("Joanne Rowling", b2);
        Book b3 = new Book("Fantastyczne zwierzęta: Tajemnice Dumbledore’a.", "Fantasy", 288);
        addBookToAuthor("Joanne Rowling", b3);

        List<Book> booksOfSomeone = new ArrayList<>();
        booksOfSomeone.add(b1);
        booksOfSomeone.add(b2);
        booksOfSomeone.add(b3);

        authorListMap.put(a1, booksOfSomeone);

    }


    public List<Book> getBooksOfAuthor(String authorName) {

        for (Author key : authorListMap.keySet()) {
            if (key.getName().equals(authorName)) {
                System.out.println("author found! Books:");
                return authorListMap.get(key);
            }
        }
        return new ArrayList<>();
    }

    public boolean addBookToAuthor(String authorName, Book book) {
        for (Author key : authorListMap.keySet()) {
            if (key.getName().equals(authorName)) {
                return authorListMap.get(key).add(book);
            }
        }
        return false;
    }

    public Set<Author> getAllAuthors() {
        return authorListMap.keySet();
    }

    public List<Book> getAllBooksList() {
        List<Book> bookList = new ArrayList<>();
        for (Author key : authorListMap.keySet()) {
            bookList.addAll(authorListMap.get(key));
        }
        return bookList;
    }

    public Map<Author, List<Book>> getAllBooksAndAuthors() {
        return authorListMap;
    }

    public boolean addAuthor(Author author) {

        if (authorListMap.containsKey(author)) {
            return false;
        } else {
            authorListMap.put(author, new ArrayList<>());
            return true;
        }
    }

    public Author getAuthor(String name) {

        for (Author key : authorListMap.keySet()) {
            if (key.getName().contains(name)) {
                return key;
            }
        }
        return null;
    }
}
