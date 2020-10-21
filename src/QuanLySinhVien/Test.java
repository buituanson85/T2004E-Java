package QuanLySinhVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    static ArrayList<SinhVien> arr = new ArrayList<>();
    // sử dụng static nó sẽ giúp ta gọi đến thằng arraylist không cần tạo đối tượng
    public static void AddStudent(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập tên sinh viên: ");
        String ten = sc.nextLine();

        System.out.println("Nhập tuổi sinh viên: ");
        int tuoi = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập địa chỉ sinh viên: ");
        String diachi = sc.nextLine();

        System.out.println("Nhập điểm trung bình: ");
        double dtb = sc.nextDouble();

        SinhVien sv = new SinhVien(id, ten, tuoi, diachi, dtb);
        //cỗ này là khởi tạo đối tượng -->gọi contructor có đối số(lấy thông tin bên trên ta nhập vào rồi chuyền vào contructtor để tạo đối tượng
        // ,đó là lợi ích của constructor -->)

        //thêm đối tượng vào arraylist
        //arrylist như một lớp học sẽ chứa sinh viên trong đó còn (SinhVien sv) là học sinh -->nhét học sinh vào lớp
        arr.add(sv); // kết thúc phần thêm sinh viên
    }

    //Sửa sinh viên

    public static void EditStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sinh viên cần sửa: ");
        int id = sc.nextInt();
        boolean TimThay = false;

        for (int i = 0 ; i < arr.size() ; i++){
            if (id == arr.get(id).getId()){
                System.out.println("Nhập tên mới sửa ");
                String ten = sc.nextLine();
                System.out.println("Nhập tuổi sinh viên: ");
                int tuoi = sc.nextInt();
                System.out.println("Nhập địa chỉ mới sửa ");
                String diachi = sc.nextLine();
                System.out.println("Nhập điểm trung bình sửa ");
                double dtb = sc.nextDouble();

                arr.get(i).setName(ten);
                arr.get(i).setAge(tuoi);
                arr.get(i).setAddress(diachi);
                arr.get(i).setGpa(dtb);
                TimThay = true;
                break;

                //đây là duyệt arr (được hiểu là duyệt danh sách lớp học nếu mà thấy sv nào trùng với
                // id đang tìm thì bắt đầu nhập thông tin để sửa ở đây dùng arr.size -->arr.size lấy sĩ số lớp học giống .length)
                //arr.get(i) được hiểu là được duyệt từng thứ tự i chạy từ 0 cho đến cuối cùng
                //arr.get(i).set... lệnh sửa



            }
        }
        if (TimThay == false ){
            System.out.println("Ko tìm thấy sinh viên nào");
        }
    }

    //Xóa sinh viên

    public static void DeleteStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id Sinh viên cần xóa");
        int id = sc.nextInt();

        //duyệt mảng
        int d = -1; // lưu vị trí tìm thấy id lại
        boolean TimThay = false;// dùng để đánh dấu tìm thấy

        for (int i = 0 ; i< arr.size() ; i++){
            if (id == arr.get(i).getId()){
                TimThay = true;
                d=i;
                break;
            }
        }
        if (TimThay == false ){
            System.out.println("Ko tìm thấy sinh viên nào");
        }else {
            arr.remove(d);//arr.remove method xóa vị trí trong arraylist
        }
        //ở đây là xóa vị trí thứ d tức là sinh viên số bao nhiêu
    }

    //xắp xếp theo điểm trung bình

    public static void SortGPA(){
        arr.sort(Comparator.comparing(SinhVien :: getGpa));
    }

    // xắp xếp theo tên

    public static void SortName(){
        arr.sort(Comparator.comparing(SinhVien :: getName));
    }

    // hiển thị ds sinh viên

    public static void Show(){
//        for (int i = 0; i < arr.size() ; i++){
//
//        }
        // muốn dùng for each phải thêm toString bên class
        for (SinhVien a : arr){
            System.out.println(a.toString());
        }
    }

    // Exit
    public static void Exit(){
        System.out.println("GoodBye");
        System.exit(0);
    }

    // bây giờ là tạo menu

    public static void Menu(){
        System.out.println("1.Add Student");
        System.out.println("2.Edit Student");
        System.out.println("3.Delete Student By Id");
        System.out.println("4.Sort Student By GPA");
        System.out.println("5.Sort Student By Name");
        System.out.println("6.Show ");
        System.out.println("0.Exit");
        int d;
        System.out.println("Nhập lựa chọn");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt(); //nhập lựa chọn

        switch (d){
            case 1: AddStudent();
                break;
            case 2: EditStudent();
                break;
            case 3: DeleteStudent();
                break;
            case 4: SortGPA();
                break;
            case 5: SortName();
                break;
            case 6: Show();
                break;
            case 0: Exit();
                break;
        }
    }

    public static void main(String[] args) {
        while (true){
            Menu();
        }
    }
}
