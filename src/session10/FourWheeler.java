package session10;

class FourWheeler extends Vehicle{
    private boolean powerSteer;

    public  FourWheeler(){

    }

    public FourWheeler(String vehicleNo,String vehicleName,int wheels,boolean powerSteer){
        this.powerSteer = powerSteer;
        this.vehicleName = vehicleName;
        this.vehicleNo = vehicleNo;
        this.wheels = wheels;
    }

    public void showDetail(){
        System.out.println(" vehicleName" + vehicleName);
        System.out.println(" vehicleNo" + vehicleNo);
        System.out.println(" wheels" + wheels);
        System.out.println(" powerSteer" + powerSteer);
    }
}

