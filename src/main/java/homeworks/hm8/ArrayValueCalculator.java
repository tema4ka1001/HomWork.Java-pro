package homeworks.hm8;

public class ArrayValueCalculator {
    public static void doCalc(String[][] array)throws ArraySizeException, ArrayDataExeption {
        for (int i=0; i<2; i++){
            if (array.length != 2 || array[0].length !=2){

            }
        }
       int sum =0;
       if (array.length != 2){
           throw new ArraySizeException();
       }
       for (String[] sub: array){
           if (sub.length !=2){
               throw new ArrayDataExeption();
           }
       }
       int tnp =0;
       for (int i=0; i<array.length; i++){
           for (int x=0; x<array[i].length; x++){
               try {
                   sum += Integer.parseInt(array[i][x]);
               }catch (NumberFormatException e){
                   throw new ArrayDataExeption();
               }
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
            return "Не вдалося перетворення елементу масиву";
        }
    }
}
