package newelevator;

import newelevator.Elevator;

import java.util.LinkedList;
import java.util.Queue;

public class RequestListener extends Thread {
    Elevator el;
    Queue<Integer> requests;
    RequestListener() {
        el = new Elevator();
        requests = new LinkedList<>();
    }

    void reqLift(int floor) {
        System.out.println("Passanger requested at Floor: " + floor);
        requests.add(floor);
    }

    void dropAt(int floor) {
        System.out.println("Passanger to drop at Floor: " + floor);
        requests.add(floor);
    }

    @Override
    public void run() {
        while (true) {
            if (el.idle) {
                Integer current = requests.poll();
                if (current != null) {
                    el.service(current);
                }
            }
        }
    }
}
