package homeworks.hm5.Second;

public class Participant {
    private String Name;

    public Participant(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void run(){
        System.out.println(this.Name+ ": " + " перебіг доріжку");
    }
    public void jump(){
        System.out.println(this.Name+": " + "перестрибнув перешкоду ");
    }

}
