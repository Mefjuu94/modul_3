package Libray;

import java.util.*;

public class Libray {

    Map<Author, List<Book>> authorListMap = new HashMap<>();

    
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


    public void getBooksOfAuthor(String authorName){

        for (Author key: authorListMap.keySet()){
            if (key.getName().equals(authorName)){
                System.out.println("author found! His books:");
                System.out.println(key.getBooks());
            }
        }

    }
    public void addBookToAuthor(String authorName, Book book){
        for (Author key: authorListMap.keySet()){
            if (key.getName().equals(authorName)){
                key.books.add(book);
            }
        }
    }
    public void getAllAuthors(){
        for (Author key: authorListMap.keySet()){
            System.out.println(key);
        }
    }
    public void getAllBooks(){
        for (Author key: authorListMap.keySet()){
            System.out.println(key.getBooks());
        }
    }
    public void getAllBooksAndAuthors() {
        System.out.println(authorListMap);

    }
    public void addAuthor(Author author) {
        authorListMap.put(author,authorListMap.get(author));
    }


}
