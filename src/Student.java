public class Student implements Comparable<Student>{

    int age;
    int height;
    String name;
    String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Student(int age, int height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;

    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


//Sortowanie listy: Stwórz klasę Student z polami: age, height, name, lastName.
// Zaimplementuj interfejs Comparable, w taki sposób, aby głównym kryterium było
// nazwisko, drugim wiek. Stwórz listę 5 obiektów i użyj metody sort. Lista przed
// powinna się różnic od listy po.