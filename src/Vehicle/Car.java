package Vehicle;

import java.util.ArrayList;

public class Car {

    private final int releaseDate; //хз, нужно ли тут еще и private, если есть final
    private String engineType;
    private double newCarMaxSpeed;
    private double zeroToHundredTime;
    private int passengerCapacity;
    private int passengersIn;
    private double currentSpeed;
    private ArrayList<CarWheel> wheels = new ArrayList(4);
    private ArrayList<CarDoor> doors = new ArrayList<>(4);



    public Car(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Car(int releaseDate, String engineType, double newCarMaxSpeed, double zeroToHundredTime, int passengerCapacity, int passengersIn, double currentSpeed) {
        this.releaseDate = releaseDate;
        this.engineType = engineType;
        this.newCarMaxSpeed = newCarMaxSpeed;
        this.zeroToHundredTime = zeroToHundredTime;
        this.passengerCapacity = passengerCapacity;
        this.passengersIn = passengersIn;
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void addPassenger() {
        this.passengersIn++;
    }

    public void removePassenger() {
        if (passengersIn != 0) {
            this.passengersIn--;
        } else {
            System.out.println("No passengers in!");
        }
    }

    public void removeAllPassengers() {
        this.passengersIn = 0;
    }

    public CarDoor indexGetDoor(int index) {
        return doors.get(index);
    }

    public CarWheel indexGetWheel(int index) {
        return wheels.get(index);
    }

    public void removeWheels (int x) {
        wheels.clear();
    }

    public void addWheels (int x) {
        for (int i = 0; i < x; i++) {
            wheels.add(new CarWheel());
        }
    }

    public double currentMaxSpeed() {
        double min = 1;
        if (passengersIn == 0) {
            return 0;
        } else {
            for (int i = 0; i < wheels.size(); i++) {
                if (wheels.get(i).getWheelState() < min) {
                    min = wheels.get(i).getWheelState();
                }
            }
            return newCarMaxSpeed * min;
        }
    }

    public void carInfo() {

        System.out.println("Type of engine: " + engineType);
        System.out.println("Max speed of new car " + newCarMaxSpeed);
        System.out.println("Time 0-100: " + zeroToHundredTime);
        System.out.println("Passenger capacity: " + passengerCapacity);
        System.out.println("Passengers in: " + passengersIn);
        System.out.println("Current speed: " + currentSpeed);
        System.out.println("Current max speed: " + currentMaxSpeed());

    }




}
