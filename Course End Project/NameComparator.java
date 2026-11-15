import java.util.Comparator;


// sorts students by name (A to Z)
public class NameComparator implements Comparator<Student> {
    
    public int compare(Student a, Student b) {
        int r = a.name.compareToIgnoreCase(b.name);
        if (r == 0) {
            return a.rollNo - b.rollNo;
        }
        return r;
    }
}
