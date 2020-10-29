package Manager.Cat;

import cat.exam.CatDetail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerCat {
    ArrayList<CatDetail> catList = new ArrayList<>();

    public ManagerCat() {
    }

    public void Input(ColorManager colorManager){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số mèo cần thêm");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++){
            CatDetail catDetail = new CatDetail();
            catDetail.nhap(colorManager);

            catList.add(catDetail);
        }
    }

    public void Display(){
        for (int i = 0; i < catList.size(); i++){
            catList.get(i).hienthi();
        }
    }

    public void Sort(){
        Collections.sort(catList, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return o1.getMau().compareToIgnoreCase(o2.getMau());
            }
        });
        Display();
    }

    public void Find(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại cần tìm kiếm");
        String loai = sc.nextLine();
        int count = 0;

        for(CatDetail catDetail : catList){
            if (catDetail.getLoai().equalsIgnoreCase(loai)){
                catDetail.hienthi();
                count++;
            }
        }
        if (count == 0){
            System.err.println("ko tồn tại mèo");
        }
    }

    public void SortByColor(){
        Collections.sort(catList, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                if (o1.getIdColor() <= o2.getIdColor()){
                    return -1;
                }
                return 1;
            }
        });
        Display();
    }
}
