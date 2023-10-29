package homeworks;

import homeworks.hm4.Animal;
import homeworks.hm4.Cat;
import homeworks.hm4.Dog;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Application {
    public static void main(String[] args) {
        ArrayList<Animal>animals=new ArrayList<Animal>();
        animals.add(new Cat("Dasha", "Silver"));
        animals.add(new Cat("Kitty", "Black"));
        animals.add(new Dog("Tima", 3));
        animals.add(new Dog("Буч", 7));
        System.out.println();


        /*System.out.println(animals.get(0).Show());
        animals.get(0).Run();
        System.out.println(animals.get(1).Show());
        animals.get(1).Run();

         */

        for (int i=0; i<animals.size(); i++){
            animals.get(i).Run();
            animals.get(i).Swim();
            System.out.println(animals.get(i).Show());
        }

        Animal debil = new Animal("Name");
       Animal.Amount();
        Cat.Count();
        Dog.Count2();
    }
}
