package Vehicle;

public class CarDoor {

    private boolean door;
    private boolean window;

    public CarDoor() {
        this.door = false;
        this.window = false;
    }

    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public boolean isDoor() {
        return door;
    }

    public boolean isWindow() {
        return window;
    }

    public void openDoor() {
        this.door = true;
    }

    public void closeDoor() {
        this.door = false;
    }

    public void changeDoorState() {
        if (door == true) {
            door = false;
        } else {
            door = true;
        }
    }

    public void openWindow() {
        this.door = true;
    }

    public void closeWindow() {
        this.door = false;
    }

    public void changeWindowState() {
        if (door == true) {
            door = false;
        } else {
            door = true;
        }
    }

    public void CarDoorState() {
        System.out.println("Door state: " + door);
        System.out.println("Window state: " + window);
    }

}
