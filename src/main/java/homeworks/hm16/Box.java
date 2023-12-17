package homeworks.hm16;

import java.util.ArrayList;
import java.util.List;

public class Box < T extends Fruit>{
    private List<T> fruits = new ArrayList<>();
    public void addFruit(T fruit){
        fruits.add(fruit);
    }
    public void addFruits(List<T> newFruits){
        fruits.addAll(newFruits);
    }
    public double getWeight() {
        return 0.0;
        }
    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void merge(Box<T> otherBox) {
        fruits.addAll(otherBox.fruits);
        otherBox.fruits.clear();

    }
}

