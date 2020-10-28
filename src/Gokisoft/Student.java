package Gokisoft;

public class Student {
    private String name;
    protected String rollNo;
    public int age;
    String email;
    String gender;
    String address;

    public Student() {

    }

    public Student(String name, String rollNo, int age, String email, String gender, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println(toString());
    }

}
