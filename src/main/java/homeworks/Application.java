package homeworks;

import homeworks.hm3.Car;
import homeworks.hm4.Animal;
import homeworks.hm4.Cat;
import homeworks.hm4.Dog;
import homeworks.hm5.First.Circle;
import homeworks.hm5.First.Square;
import homeworks.hm5.First.Triangle;
import homeworks.hm5.Second.Obstacle;
import homeworks.hm5.Second.Participant;
import homeworks.hm5.Second.Track;
import homeworks.hm5.Second.Wall;
import homeworks.hm6.HomeWorkApp;
import homeworks.hm7.StringMethod;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {


        System.out.println(StringMethod.findSymbolOccurance("Hello", 'l'));
        System.out.println(StringMethod.findWordPosition("Apollo", "ollo"));
        System.out.println(StringMethod.stringreverse("Hello"));








        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat("Dasha", "Silver"));
        animals.add(new Cat("Kitty", "Black"));
        animals.add(new Dog("Tima", 3));
        animals.add(new Dog("Буч", 7));
        System.out.println();

        //ArrayList<Triangle.ITInterface> itInterfaces = new ArrayList<Triangle.ITInterface>();
        //itInterfaces.add(new Triangle(2.3, 4.3, 5.0));
        //itInterfaces.add(new Circle(5.5));
        //itInterfaces.add(new Square(32.4));


        Car audir8 = new Car("name", 300);
        audir8.start();
        System.out.println("-------------------");

        /*S
        ystem.out.println(animals.get(0).Show());
        animals.get(0).Run();
        System.out.println(animals.get(1).Show());
        animals.get(1).Run();

         */
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).Run();
            animals.get(i).Swim();
            System.out.println(animals.get(i).Show());
        }
        System.out.println("------------------");
        Animal animal = new Animal("Name");
        Animal.Amount();
        Cat.Count();
        Dog.Count2();

        //System.out.println("____________________");
        // System.out.println("Площа всіх фігур: " + squareOfAllFigurehw5(itInterfaces));

        System.out.println("_____________________");
        ArrayList<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Human"));
        participants.add(new Participant("Cat"));
        participants.add(new Participant("Robot"));

        ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
        obstacles.add(new Track(200));
        obstacles.add(new Wall(4));
        obstacles.add(new Track(500));
        obstacles.add(new Wall(2));
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }

    }

    public static double squareOfAllFigurehw5(ArrayList<Triangle.ITInterface>sumfigure){
      double sum = 0;
        for (int i=0; i<sumfigure.size(); i++){
            if ( sumfigure.get(i) instanceof Square){
                sum += ((Square)sumfigure.get(i)).calculate();
            }
            else if (sumfigure.get(i) instanceof Triangle){
                sum += ((Triangle) sumfigure.get(i)).calculate();
                }
            else if (sumfigure.get(i) instanceof Circle){
                sum += ((Circle) sumfigure.get(i)).calculate();
            }
        }
        return sum;
    }



}
