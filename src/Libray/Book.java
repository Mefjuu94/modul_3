package Libray;

import java.util.Objects;

public class Book implements Comparable<Book> {
    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.numberOfPages, o.numberOfPages);
    }

    private String title;
    private String genre;
    private int numberOfPages;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(numberOfPages, book.numberOfPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, numberOfPages);
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String title, String genre, int numberOfPages) {
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

}
