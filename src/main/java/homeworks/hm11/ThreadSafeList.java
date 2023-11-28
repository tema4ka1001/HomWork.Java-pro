package homeworks.hm11;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeList<T> {
     private Object[] arry;
     private int caracity;

     private int size;
     private ReentrantLock lock;

     public ThreadSafeList(int caracity){
          if (caracity<1){
               throw new IllegalArgumentException("Максимальний розмір повинен бути не меньше 1");
          }
          this.lock= new ReentrantLock();
          this.arry = new Object[caracity];
          this.size = 0;
          this.caracity=caracity;
     }
     public void add(T element){
          lock.lock();
          try{
               if (size < caracity){
                    arry[size] = element;
                    size++;
               }else
                    throw new IllegalArgumentException("Переповнений список");
          }
          finally {
               lock.unlock();
          }
     }
     public T get(int index){
          lock.lock();
          try {
               if (index >= 0 && index < size){
                  return (T) arry[index];
               }else
                    throw new IllegalArgumentException("Index: " + index);
          }
          finally {
               lock.unlock();
          }
     }
     public void remove(T element){
          lock.lock();
          try {
               int tnp = -1;
               for (int i = 0; i<size; i++){
                    if (arry[i].equals(element)){
                         tnp = 1;
                         break;
                    }
               }
               if (tnp != -1){
                    for (int i= tnp; i < size -1; i++){
                         arry[i] = arry[i +1];
                    }
                    size--;
               }
               else{
                    throw new IllegalArgumentException("Element: " + element);
               }
          }
          finally {
               lock.unlock();
          }
     }
}
