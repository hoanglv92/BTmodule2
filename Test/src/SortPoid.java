import java.util.Comparator;

public class SortPoid implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (Integer.parseInt(o1.getPoint()) == Integer.parseInt(o2.getPoint())) {
            return 0;
        } else if (Integer.parseInt(o1.getPoint()) > Integer.parseInt(o2.getPoint())) {
            return -1;
        } else {
            return 1;
        }
    }
}
