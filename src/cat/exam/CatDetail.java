package cat.exam;

import Manager.Cat.ColorManager;

import java.util.Scanner;

public class CatDetail implements ICat {
    String loai;
    String mau;
    int idColor;
    String noiSong;

    public CatDetail() {
    }

    public CatDetail(String loai, String mau, String noiSong) {
        this.loai = loai;
        this.mau = mau;
        this.noiSong = noiSong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    @Override
    public String toString() {
        return "CatDetail{" +"Ten: "+ ten +
                ",loai='" + loai + '\'' +
                ", mau='" + mau + '\'' +
                ", noiSong='" + noiSong + '\'' +
                '}';
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập loại");
        loai = sc.nextLine();

        System.out.println("Nhập nơi sống");
        noiSong = sc.nextLine();
    }

    public void nhap(ColorManager colorManager){
        nhap();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập màu");
        while (true){
            mau = sc.nextLine();
            idColor = colorManager.checkColor(mau);
            if (idColor != -1){
                break;
            }else {
                colorManager.Display();
                System.out.println("Nhập lại mã màu");
            }
        }
    }

    @Override
    public void hienthi() {
        System.out.println(toString());
    }
}
