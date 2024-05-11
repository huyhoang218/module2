package fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){}

    public void setSpeed(int speed) {
        if (speed == 2) {
            this.speed = MEDIUM;
        } else if (speed == 3){
            this.speed = FAST;
        }
    }
    public void setOn() {
        on = true;
    }
    public void setOff() {
        on = false;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "speed = " + speed + " color = " + color + " radius = " + radius + " fan is on";
        }
        return "speed = " + speed + " color = " + color + " radius = " + radius + " fan is off";
    }
}
