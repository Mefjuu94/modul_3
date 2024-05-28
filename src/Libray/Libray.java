package Libray;

import java.util.*;

public class Libray {

    private Map<Author, List<Book>> authorListMap = new HashMap<>();

    
    public void dzialaj(){

        // add rowling with books automaticly
        Author a1 = new Author("Joanne Rowling",1965,"Fantasy");

        Book b1 = new Book("Harry Potter i Kamień Filozoficzny","Fantasy",320);
        addBookToAuthor("Joanne Rowling",b1);
        Book b2 = new Book("Harry Potter i więzień Azkabanu","Fantasy",456);
        addBookToAuthor("Joanne Rowling",b2);
        Book b3 = new Book("Fantastyczne zwierzęta: Tajemnice Dumbledore’a.","Fantasy",288);
        addBookToAuthor("Joanne Rowling",b3);

        List<Book> booksOfSomeone = new ArrayList<>();
        booksOfSomeone.add(b1);
        booksOfSomeone.add(b2);
        booksOfSomeone.add(b3);

        a1.setBooks(booksOfSomeone);
        authorListMap.put(a1,booksOfSomeone);

    }


    public List<Book> getBooksOfAuthor(String authorName){

        for (Author key: authorListMap.keySet()){
            if (key.getName().equals(authorName)){
                System.out.println("author found! Books:");
                return key.getBooks();
            }
        }
        return null;
    }
    public boolean addBookToAuthor(String authorName, Book book){
        for (Author key: authorListMap.keySet()){
            if (key.getName().equals(authorName)){
               return key.books.add(book);
            }
        }
        return false;
    }

    public Map<Author, List<Book>> getAllAuthors(){
        for (Author key: authorListMap.keySet()){
            System.out.println(key.getName());
        }
        return Map.of();
    }
    public void getAllBooks(){
        for (Author key: authorListMap.keySet()){
            System.out.println(key.getBooks());
        }
    }

    public List<Book> getAllBooksList(){
        List<Book> bookList = new ArrayList<>();
        for (Author key: authorListMap.keySet()){
            bookList.addAll(key.getBooks());
        }
        return bookList;
    }

    public Map<Author, List<Book>> getAllBooksAndAuthors() {
        return authorListMap;

    }
    public void addAuthor(Author author) {
        authorListMap.put(author,authorListMap.get(author));
    }
}
