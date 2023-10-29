package homeworks.hm4;

public class Animal {
    private String Name;
    public static int amount=0;


    public Animal(String name) {
        amount++;
        Name = name;
    }
    public static void Amount(){
        System.out.println("Кількість тварин: " + amount);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void Run(){
    }
    public void Swim(){
    }

    public String Show(){
        return "Name: " + this.Name;
    }
}
