package homeworks.hm8;

 public class ArrayDataException extends Exception {
 public ArrayDataException(int row, int column){
     super("Element at row [" + row + "] " + "and columt [" + column + "] " + "is not a number");
  }
}