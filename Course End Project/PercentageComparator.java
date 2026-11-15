import java.util.Comparator;

// sorts students by percentage (highest first)
public class PercentageComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.percentage > b.percentage) return -1;
        if (a.percentage < b.percentage) return 1;
        return a.rollNo - b.rollNo;
    }
}
