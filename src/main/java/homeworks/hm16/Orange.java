package homeworks.hm16;

public class Orange extends Fruit  {
   private String taste;

    public Orange(String taste, int weight, String name, String color) {
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
