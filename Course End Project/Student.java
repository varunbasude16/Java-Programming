
import java.util.Comparator;
import java.io.Serializable;
// Student class - stores details of one student
// Serializable is needed to save objects in a file
// Comparable is used to rank students by total marks
public class Student implements Serializable, Comparable<Student> {

    int rollNo;
    String name;
    int m1, m2, m3;   // marks in 3 subjects
    int total;
    double percentage;

    public Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        total = m1 + m2 + m3;
        percentage = Math.round(total / 3.0 * 100) / 100.0;   // 2 decimal places
    }

    // natural order: highest total first
    // if total is same, smaller roll number first
    // (otherwise TreeSet will remove one of the students)
    public int compareTo(Student s) {
        if (total != s.total) {
            return s.total - total;
        }
        return rollNo - s.rollNo;
    }

    public String toString() {
        return rollNo + "\t" + name + "\t" + m1 + "\t" + m2 + "\t" + m3 + "\t" + total + "\t" + percentage;
    }
}
