package homeworks.hm5.First;

public class Square implements ITInterface {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculate() {
        return side * side;
    }
}
