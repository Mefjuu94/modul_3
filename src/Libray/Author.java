package Libray;

import java.time.LocalDate;
import java.util.Objects;

public class Author {

    private String name;
    private int age;
    private String favouriteGenre;


    public Author(String name, int age, String favouriteGenre) {
        this.name = name;
        this.age = LocalDate.now().getYear() - age;
        this.favouriteGenre = favouriteGenre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }

    public void setFavouriteGenre(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(age, author.age) && Objects.equals(favouriteGenre, author.favouriteGenre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, favouriteGenre);
    }

}
