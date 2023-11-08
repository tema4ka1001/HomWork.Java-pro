package homeworks.hm8;

public class ArrayValueCalculator {
    public static void doCalc(String[][] array)throws ArraySizeException, ArrayDataExeption{
        for (int i=0; i<array.length; i++){
            for (int x=0; x<array[i].length; x++){
                int tnp = Integer.parseInt(array[i][x]);
                System.out.println(array[i][x] + " ");
            }
            System.out.println();
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
            return "Не вдалося перетворення елементу масиву";
        }
    }
}
