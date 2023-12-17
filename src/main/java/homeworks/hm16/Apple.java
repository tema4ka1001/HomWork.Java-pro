package homeworks.hm16;

public class Apple extends Fruit {
    private String taste ;

    public Apple(String taste, int weight, String name, String color) {
        super(weight, name, color);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}


