package homeworks.hm8;

public class ArraySizeException extends Exception{
    public ArraySizeException(int size) {
        super("Expected size 4x4, got: " + size);
    }
}
