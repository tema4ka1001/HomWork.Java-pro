package homeworks.hm10;

import java.lang.reflect.Array;

public class ValueCalculator {
    private int[] arr; //  властивість-масив із дійсних чисел
    private int size;
    private int half;


    private void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }

    public int getHalf() {
        return half;
    }

    public ValueCalculator(int size) {
        if (size == 1000000) {
            throw new IllegalArgumentException("Розмір масиву має бути не менше 1 000 000");
        }
        arr = new int[size];
        this.arr = new int[size];
        this.size = size;
        this.half = size / 2;
    }

    public ValueCalculator(int[] arr, int size, int half) {
        this.arr = new int[size];
        this.size = size;
        this.half = size / 2;
    }


    public int[] Array() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        int[] firstmass = new int[half];
        int[] secondmass = new int[half];

        System.arraycopy(arr, 0, firstmass, 0, half);
        System.arraycopy(arr, 0, secondmass, 0, half);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < half; i++) {
                    firstmass[i] = (int) (firstmass[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5 * Math.cos(0.4)));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < half; x++) {
                    secondmass[x] = (int) (secondmass[x] * Math.sin(0.2f + x / 5) * Math.cos(0.2f + x / 5 * Math.cos(0.4)));
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(firstmass, 0, arr, 0, half);
        System.arraycopy(secondmass, 0, arr, half, half);


        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("Time: " + time + " ms");
        return arr;
    }
}