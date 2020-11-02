package LinhTinh;

public class VNPerson extends Person {

    public VNPerson() {
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
    }


    @Override
    public void display() {
        super.display();
        System.out.printf("%-15s %-15s", " ", " ");
        System.out.printf("%.2f", invoice());
    }

    @Override
    public float invoice() {
        if (getKw() <= quota){
            return getKw() * price;
        }else {
            return (float)(price * quota + (getKw() - quota) * price * 1.5);
        }
    }

    @Override
    public float pay() {
        return (float) (getWallet() - invoice());
    }

    @Override
    public String retrievePhoneNumber() {
        return "+84" + getPhone();
    }

    @Override
    public void displayPay(){
        super.displayPay();
        System.out.printf("%-15s %-15f %-15f %-15f", retrievePhoneNumber(), getWallet(), invoice(), pay());
    }
}
