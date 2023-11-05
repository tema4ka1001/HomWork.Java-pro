package homeworks.hm6;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp homeWorkApp = new HomeWorkApp();
        homeWorkApp.printThreeWords();
        homeWorkApp.checksumsing(2, 3);
        homeWorkApp.printcolor(20);
        homeWorkApp.Numbers();
        homeWorkApp.method(1,3);
        homeWorkApp.method1(12);
        homeWorkApp.method2(3);
        homeWorkApp.method3(3, "Hallo");
        }
    public void printThreeWords(){
        System.out.println("Apple");
        System.out.println("Orange");
        System.out.println("Banana");
    }
    public void checksumsing(int a, int b){
        int sum = a + b;
        if (sum < 0){
            System.out.println("Sum Positive");
        }else
            System.out.println("Sum Negative");
    }
    public void printcolor(int value){
        if (value < 0){
            System.out.println("Red");
        }else if (value >= 0){
            System.out.println("Yellow");
        }else if (value > 100){
            System.out.println("Green");
        }
    }
    public void Numbers(){
        int a=10;
        int b=5;
        if (a < b){
            System.out.println("a >= b");
        }else
            System.out.println("a < b");
    }

    public void method(int a, int b) {
        int sum = a + b;
        boolean b1;
        if (sum > 10 || sum < 20) {
            b1 = true;
        } else b1 = false;
    }

    public void method1(int i){
        if (i > 0){
            System.out.println("Sum Positive");
        }else
            System.out.println("Sum Negative");
    }
    public void method2(int a) {
        boolean sum;
        if (a > 0) {
            sum = true;
        } else
            sum = false;
    }
    public void method3(int a, String string){
        for (int i=0; i<a; i++){
            System.out.println(string);
        }
    }

}


