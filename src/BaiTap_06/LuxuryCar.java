package BaiTap_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LuxuryCar extends Car {
    private float specialRate;

    public LuxuryCar() {
    }

    public LuxuryCar(String name, String producer, String year, int seat, float rootPrice, float specialRate) {
        super(name, producer, year, seat, rootPrice);
        this.specialRate = specialRate;
    }

    public float getSpecialRate() {
        return specialRate;
    }

    public void setSpecialRate(float specialRate) {
        this.specialRate = specialRate;
    }
    @Override
    public float caculatePrice(){
        return getRootPrice() + caculateTax() + getRootPrice() * specialRate;
    }

    public float caculatePrice(float transportCost){
//        return getRootPrice() + caculateTax() + getRootPrice() * specialRate + transportCost;
        return caculatePrice() + transportCost;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tỷ giá đặc biệt: ");
        try {
            specialRate = Float.parseFloat(sc.nextLine());;
        }catch (InputMismatchException e){
            System.out.println("Nhập số thực");
        }catch (Exception e){
            System.out.println("Nhập số thực");
        }finally {

        }
    }
}
