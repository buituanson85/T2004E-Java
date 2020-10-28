package Gokisoft;

public abstract class HinhHoc {
    String tenHinh;
    int soCanh;

    public abstract void Nhap();

    public abstract void InKQ();

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }
}
