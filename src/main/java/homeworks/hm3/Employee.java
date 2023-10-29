package homeworks.hm3;

public class Employee {
    private String Name;
    private String Position;
    private String Email;
    private String Phone;
    private int Age;

    public Employee(String Name, String Position, String Email, String Phone, int Age){
        this.Name = Name;
        this.Position = Position;
        this.Email=Email;
        this.Phone=Phone;
        this.Age=Age;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
