public class vehicle {
    // Class Variable
    public static String Category = "vehicle";



    // Instance Variable
    private int WheelNumber;

    private String vehicleName;


    private String vehicleBrand;

    private double vehiclePrice;
    private String vehicleSpeed;
    private String vehicleFlying;
    private String vehicleEngine;
    private String vehicleTires;
    private String vehicleBrake;
    private String vehicleTraffic;





    // Constructors

    public vehicle () { this.WheelNumber = 5; }


    public vehicle ( int WheelNumber) {this.WheelNumber = WheelNumber; }

    // Methods
    /* Création des setters*/

    public static void setCategory(String category) {
        Category = category;
    }

    public void setWheelNumber(int wheelNumber) {
        WheelNumber = wheelNumber;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public void setVehicleSpeed(String vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public void setVehicleFlying(String vehicleFlying) {
        this.vehicleFlying = vehicleFlying;
    }

    public void setVehicleEngine(String vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    public void setVehicleTires(String vehicleTires) {
        this.vehicleTires = vehicleTires;
    }

    public void setVehicleBrake(String vehicleBrake) {
        this.vehicleBrake = vehicleBrake;
    }

    public void setVehicleTraffic(String vehicleTraffic) {
        this.vehicleTraffic = vehicleTraffic;
    }
    /*Création des getters*/

    public static String getCategory() {
        return Category;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getWheelNumber() {
        return WheelNumber;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public String getVehicleSpeed() {
        return vehicleSpeed;
    }

    public String getVehicleFlying() {
        return vehicleFlying;
    }

    public String getVehicleEngine() {
        return vehicleEngine;
    }

    public String getVehicleTires() {
        return vehicleTires;
    }

    public String getVehicleBrake() {
        return vehicleBrake;
    }

    public String getVehicleTraffic() {
        return vehicleTraffic;
    }

    public void display(){
    System.out.println("Name the vehicle is : " + this.vehicleName);
    System.out.println("Number the vehicle is : " + this.WheelNumber);
    System.out.println("Brand th vehicle is : " + this.vehicleBrand);
    System.out.println("Price the vehicle is : " + this.vehiclePrice + "Euro");
    System.out.println("Speed the vehicle is : " + this.vehicleSpeed);
    System.out.println("Flying the vehicle is : " + this.vehicleFlying);
    System.out.println("Engine the vehicle is : " + this.vehicleEngine);
    System.out.println("Tire the vehicle is : " + this.vehicleTires);
    System.out.println("Brake the vehicle is : " + this.vehicleBrake);
    System.out.println("Traffic the vehicle is : " + this.vehicleTraffic);
    }
}
