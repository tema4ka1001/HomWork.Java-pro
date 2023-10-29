package homeworks.hm4;

import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;

public class Dog extends Animal {
private int age;
public static int count = 0;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
        count++;
    }

    public static void Count2(){
        System.out.println("Кількість cобак: " + count);
    }

    @Override
    public void Run() {
        System.out.println("Сoбака пробігла 500 метрів: " + this.getName());
    }
int dog;
    @Override
    public void Swim() {
        if ( dog < 10){
            System.out.println("Cобака пливе 10 метрів: " +  this.getName());
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String Show() {
        return super.Show() + "\nage: " + this.age;
    }
}
