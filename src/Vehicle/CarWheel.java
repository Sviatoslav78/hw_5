package Vehicle;

public class CarWheel {

    private double wheelState;

    public CarWheel() {
        wheelState = 1;
    }

    public CarWheel(double wheelState) {
        if (wheelState >= 0 || wheelState <= 1) {
            this.wheelState = wheelState;
        } else {
            System.out.println("Wheel state must be in range [0;1]");
        }
    }

    public void changeWheel() {
        this.wheelState = 1;
    }

    public void burnWheel(double x) {
        if (x >= 0 || x <= 100) {
            this.wheelState -= wheelState * x / 100;
        }
    }

    public double getWheelState() {
        return wheelState;
    }

    public void wheelInfo() {
        System.out.println("State of wheel: " + wheelState * 100 + "%");
    }
}
