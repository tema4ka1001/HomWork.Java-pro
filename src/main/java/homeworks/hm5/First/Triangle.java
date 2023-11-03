package homeworks.hm5.First;

public class Triangle implements ITInterface {
    private double sidea;
    private double sideb;
    private double sidev;

    public Triangle(double sidea, double sideb, double sidev) {
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidev = sidev;
    }

    public double getSidea() {
        return sidea;
    }

    public void setSidea(double sidea) {
        this.sidea = sidea;
    }

    public double getSideb() {
        return sideb;
    }

    public void setSideb(double sideb) {
        this.sideb = sideb;
    }

    public double getSidev() {
        return sidev;
    }

    public void setSidev(double sidev) {
        this.sidev = sidev;
    }

    @Override
    public double calculate() {
        return sidea * sideb * sidev;
    }

    public static interface ITInterface {
          double calculate();
    }
}
