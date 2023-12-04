
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,4,"Red");


 //       vehicle.setColor("Red");
//        vehicle.setDoors(4);
//        vehicle.setWheels(4);
        System.out.println(vehicle);


        Vehicle carVehicle = new Car(4,8,"White","M-005","BEAST");
//        carVehicle.setWheels(4);
//        carVehicle.setDoors(2);
//        carVehicle.setColor("White");
        System.out.println(carVehicle);

        Car car = new Car(6,4,"Black","CAR","M-001");
//        car.setColor("Blue");
//        car.setModel("M-001");
//        car.setName("BEAST");
//        car.setType("CAR");
        car.setName("ROVER");
        System.out.println(car);

    }
}