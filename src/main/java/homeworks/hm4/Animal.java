package homeworks.hm4;

public class Animal {
    private String Name;
    private  static int count=0;


    public Animal(String name) {
        Name = name;

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
