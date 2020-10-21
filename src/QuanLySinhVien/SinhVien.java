package QuanLySinhVien;

public class SinhVien {
    private int id;  // mã sinh viên
    private String name; // tên sinh viên
    private int age; // tuổi sinh viên
    private String address; //địa chỉ sinh viên
    private double gpa; //điểm trung bình

    //Tạo constructor không có đối số

    public SinhVien() {

    }

    //tạo Constructor có đối số

    public SinhVien(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    //tạo getter và setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
//Constructor là hàm tạo , nó được sử dụng khi ta khởi tạo đối tượng
    //getter dùng để truy xuất thuộc tính của đối tượng
    //setter dùng để sửa thuộc tính của đối tượng
    //2 class
    //class 1 dùng để chứa các thuộc tính + hàm tạo + getter + setter
    //class 2 dùng để bắt đầu khởi tạo đối tượng và thực hiện tạo menu theo đầu bài
}



