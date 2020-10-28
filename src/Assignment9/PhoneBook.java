package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        boolean timThay = false;
        for (int i = 0; i < PhoneList.size(); i++){
            if (PhoneList.get(i).contains(name)){
                //Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này.
                // Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, nếu không trả về false.
                timThay = true;
                if (!PhoneList.get(i).contains(phone)){
                    String s = PhoneList.get(i);
                     s += ": " + phone;
                }else {
                    System.out.println("Số điện thoại đã có trong danh bạ");
                }
            }
        }
        if (!timThay){
            PhoneList.add(name + "," + phone);
        }
    }

    @Override
    void remuvePhone(String name) {
        boolean search = false;
        for (int i = 0; i < PhoneList.size(); i++){
            if (name.equalsIgnoreCase(PhoneList.get(i).substring(0, PhoneList.get(i).indexOf(",")))){
                //Phương thức equalsIgnoreCase() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường.
                // Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
                //substring(int startIndex): Phương thức này trả về đối tượng chuỗi mới là chuỗi con của chuỗi
                // đã cho tính từ startIndex đã nhập đến cuối cùng.
                //Phương thức indexOf() trả về chỉ số của giá trị ký tự đã cho hoặc chuỗi con.
                // Nếu không tìm thấy trả lại giá trị -1. Chỉ số (index) được đếm từ 0.
                search = true;
                PhoneList.remove(PhoneList.get(i));
                System.out.println("remote");
                break;
            }
        }
        if (!search){
            System.out.println("không tìm thấy người có tên :" + name);
        }
    }

    @Override
    void updatePhone(String name, String newPhone) {
        String ten = name;
        ten = ten.substring(0, ten.indexOf(","));
        PhoneList.set(PhoneList.indexOf(ten), ten + "," + newPhone);
        System.out.println("Update");
    }

    @Override
    void searchPhone(String name) {
        boolean search = false;
        for (int i = 0; i < PhoneList.size(); i++){
            if (PhoneList.get(i).contains(name)){
                search = true;
                System.out.println(PhoneList.get(i).toString());
                break;
            }
        }
        if (!search){
            System.out.println("Ko tìm thấy");
        }
    }

    @Override
    void sort() {
        if (PhoneList.size() == 0){
            System.out.println("danh bạ ko có ai");
        }{
            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
             //Collections trong java là một khuôn khổ cung cấp một kiến trúc để lưu trữ và thao tác tới nhóm các đối tượng.
            // Tất cả các hoạt động mà bạn thực hiện trên một dữ liệu như tìm kiếm, phân loại, chèn, xóa,... có thể được
            // thực hiện bởi Java Collections.
            System.out.println("Sắp xếp tăng dần");
            for (int i = 0; i < PhoneList.size(); i++){
                System.out.println(PhoneList.get(i));
            }

            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                }
            });
            System.out.println("Sắp xếp giảm dần");
            for (int i = 0; i < PhoneList.size(); i++){
                System.out.println(PhoneList.get(i));
            }
        }
    }
}
