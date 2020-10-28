package Assignment7;

public class Student {
    private String fullName;
    private int age;
    private String address;
    private int yearBird;
    private String sex;
    private int phone;
    private String facebook;

    //Tạo constructor không có đối số

    public Student() {
    }

    //Tạo constructor có đối số

    public Student(String fullName, int age, String address, int yearBird, String sex, int phone, String facebook) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.yearBird = yearBird;
        this.sex = sex;
        this.phone = phone;
        this.facebook = facebook;
    }

    public Student(String fullName, int age, String address, int yearBird, String sex, String phone, String facebook) {
    }

    //Tạo set get

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearBird() {
        return yearBird;
    }

    public void setYearBird(int yearBird) {
        this.yearBird = yearBird;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    //toString


    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", yearBird=" + yearBird +
                ", sex='" + sex + '\'' +
                ", phone=" + phone +
                ", facebook='" + facebook + '\'' +
                '}';
    }

}


