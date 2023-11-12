package homeworks.hm8;

public class ArrayValueCalculator {
    public static void doCalc(String[][] array)throws ArraySizeException, ArrayDataExeption {
       int sum =0;
       if (array.length != 2){
           throw new ArraySizeException();
       }
       for (String[] sub: array){
           if (sub.length !=2){
               throw new ArrayDataExeption();
           }
       }
    }

    public static class ArraySizeException extends ArrayStoreException {
        @Override
        public String getMessage() {
            return "Передача масиву іншого розміру";
        }
    }
    public static class ArrayDataExeption extends NumberFormatException {
        @Override
        public String getMessage() {
            return "Не вдалося перетвореннz елементу масиву";
        }
    }
}
