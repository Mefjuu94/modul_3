import java.util.Comparator;

public class StudentsLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getLastName().compareTo(o2.getLastName()) == 0) {  //if surname are the same
            return Integer.compare(o1.getAge(), o2.getAge());  // then compare age
        }else
            return CharSequence.compare(o1.getLastName(), o2.getLastName()); // if not the sane compare char sequence
    }
}
