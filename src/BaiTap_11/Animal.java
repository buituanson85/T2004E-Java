package BaiTap_11;

public abstract class Animal implements IRunning{
    String name;
    String foodType;

    public Animal() {
    }

    public Animal(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public abstract void showSound();

    @Override //Interface
    public void onRunning() {
        System.out.println("Animal is running");
    }
}
