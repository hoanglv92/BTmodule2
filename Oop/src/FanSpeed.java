public class FanSpeed {
    public static void main(String[] args) {
        Fan fan=new Fan(3,true,7,"red");
        System.out.println(" quạt 1 : " +fan.toString());
        Fan fan1=new Fan(1,false,5,"blue");
        System.out.println(" quạt 1 : " +fan1.toString());
    }
}
class Fan {
    final int SLOW = 1;
    final int MEDIUM =2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //get
    public int getSLOW() {
        return this.SLOW;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean geton() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }
    //set


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {

    }

    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        String  disPlay = " ";
        if (this.on == true) {
            disPlay= "Fan is on {" +
                    " speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

        }else {
            return "Fan is of";
        }
        return disPlay;
    }
}