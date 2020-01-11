package ArrayListStuDents;

public class Student {
    private String name;
    private String id;
    private int year;
    private String location;

    public Student() {
    }

    public Student(String name, String id, int year, String location) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.location = location;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void disPlay(){
        System.out.printf("%-40s%-10s%-10s%-50s%n",getName(),getId(),getYear(),getLocation());
    }

}
