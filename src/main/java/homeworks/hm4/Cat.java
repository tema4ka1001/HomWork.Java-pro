package homeworks.hm4;

public class Cat extends Animal {
    private String colors;
    private static int count = 0;

    public Cat(String name, String colors) {
        super(name);
        this.colors = colors;
    }

    @Override
    public void Run() {
        System.out.println("Кіт пробіг 200 метрів: " + this.getName());
    }

    @Override
    public void Swim() {
        System.out.println("Кіт не вміє плавати: " + this.getName());
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String Show() {
        return super.Show() + "\ncolors: " + this.colors;
    }
}
