package Lab6;

class TwoWheeler implements IVehicle {
    String ID;
    int type;

    public TwoWheeler(String ID, int type) {
        this.ID = ID;
        this.type = type;
    }

    public void start() {
        System.out.println("Starting the " + type);
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating at speed: " + speed + " kmph");

    }

    @Override
    public void brake() {
        System.out.println("Applying brakes ");

    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + type);
    }

    public void displayDetails() {
        System.out.println("Vehicle No.: " + STAEDID + "-" + ID);
        System.out.println("Vehicle Type.: " + type);
    }

    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler("No001", 21);
        tw.displayDetails();
        tw.start();
        tw.stop();
    }
}
