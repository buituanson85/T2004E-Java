package BaiTap_06;

public class Test {
    public static void main(String[] args) {
        LuxuryCar myLuxuryCar = new LuxuryCar();

        myLuxuryCar.Input();
        myLuxuryCar.getInfo();

        float totalPrice = myLuxuryCar.caculatePrice(20000);
        System.out.println("tổng giá" + totalPrice);
    }
}
