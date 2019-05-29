package entity;

public class Student {
    private String enrollID;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }

    public Student(String enrollID, String firstName, String lastName, int age) {
        this.enrollID = enrollID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEnrollID() {
        return enrollID;
    }

    public void setEnrollID(String enrollID) {
        this.enrollID = enrollID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
