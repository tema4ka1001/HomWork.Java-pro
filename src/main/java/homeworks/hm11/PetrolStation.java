package homeworks.hm11;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class PetrolStation {
        private double amount;
        private Semaphore semaphore;


        public PetrolStation(double amount) {
            if (amount < 0) {
                throw new IllegalArgumentException("Початкова кількість палива повинна бути не від'ємною");
            }

            this.amount = amount;
            this.semaphore = new Semaphore(3);
        }
        public void Refuel(double request){
            if (semaphore.tryAcquire()){
                try {
                    semaphore.acquire();
                    System.out.println("Почалась заправка: " + request + "Літрів палива");
                    Random rnd = new Random();
                    int tnp = rnd.nextInt(8)+3;
                    Thread.sleep(tnp*1000);
                    if (amount >= request){
                        amount -= request;
                        System.out.println("Заправка завершена, залишок: " + amount + "Літрів");
                    }else{
                        System.out.println("Не вдалось заправити");
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }
        }
}

