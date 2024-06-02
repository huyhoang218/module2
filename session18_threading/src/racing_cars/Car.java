package racing_cars;

import java.util.Random;

import static racing_cars.Main.DISTANCE;
import static racing_cars.Main.STEP;

public class Car implements Runnable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percent = (runDistance * 100) / DISTANCE;

                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percent >= i + STEP) {
                        log += "=";
                    } else if (percent >= i && percent < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name + log + " " + Math.min(DISTANCE, runDistance));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Car " + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " finish in " + (endTime - startTime) / 1000 + " s");
    }
}
