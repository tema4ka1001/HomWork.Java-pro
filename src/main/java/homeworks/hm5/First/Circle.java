package homeworks.hm5.First;

public class Circle implements ITInterface {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculate() {
        return Math.PI * radius;
    }
}
