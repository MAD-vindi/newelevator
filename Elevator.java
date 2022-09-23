package newelevator;

import java.util.concurrent.TimeUnit;

public class Elevator {
    Boolean idle;
    int currFloor;

    Elevator() {
        idle = true;
        currFloor = 0;
    }

    void moveUp(int floor) {
        while (currFloor < floor) {
            currFloor++;
            System.out.println("Lift going up: " + (currFloor - 1) + "->" + currFloor);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    void moveDown(int floor) {
        while (currFloor > floor) {
            currFloor--;
            System.out.println("Lift going down: " + (currFloor + 1) + "->" + currFloor);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    void service(Integer floor) {
        if (currFloor < floor) {
            moveUp(floor);
        } else {
            moveDown(floor);
        }
        System.out.println("Life at floor: " + floor + "\nDoor Open");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Door closed");
        idle = true;
    }
}