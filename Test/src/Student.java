import java.io.Serializable;

public class Student implements Serializable ,Comparable<Student> {
    private String name;
    private String id;
    private String email;
    private String point;

    public Student(String name, String id, String email, String point) {
        this.name = name;
        this.id=id;
        this.email = email;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public void showSTuden(){
        System.out.printf("%-50s%-30s%-50s%-5s\n",name,this.id,this.email,this.point);
    }

    @Override
    public int compareTo(Student student) {
        if (Integer.parseInt(this.point)==Integer.parseInt(student.getPoint())){
            return 0;
        }else if (Integer.parseInt(this.point)>Integer.parseInt(student.getPoint())){
            return -1;
        }else {
            return 1;
        }
    }
}
