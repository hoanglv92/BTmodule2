package DemergingQueue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.SimpleFormatter;

public class Student {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
    Calendar calendar = Calendar.getInstance();
    private String name;
    private String id;
    private String gender;
    private String dateOfBirth;

    public Student() {
    }

    public Student(String name, String id, String gender, String dateOfBirth) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public  void disPlay(){
        System.out.printf(" Name:  %-30s ID: %-10s Date Of Birth: %-20sGender: %-15s\n", this.getName(), this.getId(),this.getDateOfBirth(), this.getGender());
    }
}
