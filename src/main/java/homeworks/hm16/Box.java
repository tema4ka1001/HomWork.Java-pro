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
    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        float fruitWeight = fruits.get(0) instanceof Apple ? 1.0f : 1.5f;
        return fruitWeight * fruits.size();
    }
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }
    public void merge(Box<T> anorherBox){
        if (this == anorherBox){
            return;
        }
        this.fruits.addAll(anorherBox.fruits);
        anorherBox.fruits.clear();
    }
}

