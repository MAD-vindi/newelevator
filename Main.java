package newelevator;

import java.util.concurrent.TimeUnit;
//import RequestListener;

public class Main {
    public static void main(String[] args) {
        RequestListener controller = new RequestListener();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            System.out.println(e);

        }
        controller.start();

        controller.reqLift(0);
        controller.dropAt(8);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
            System.out.println(e);
        }

        controller.reqLift(3);
        controller.dropAt(5);

    }

}