package homeworks.hm3;

public class Car {
    private String Name;
    private int Speed;



    public Car(String name, int speed) {
        Name = name;
        Speed = speed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
    public void start(){
        startElectricity();
        startCommand();
        startFlueSystem();
    }
    protected void startElectricity(){
        System.out.println("starElectricity");
    }
    protected void startCommand(){
        System.out.println("startCommand");
    }
    protected void startFlueSystem(){
        System.out.println("StartFlueSystem");
    }
}
