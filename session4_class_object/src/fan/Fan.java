package fan;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public void setSpeed(int speed) {
        if (speed == 2) {
            this.speed = MEDIUM;
        } else if (speed == 3){
            this.speed = FAST;
        }
    }

    public double getRadius() {
        return radius;
    }
    public void setOn() {
        on = true;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
