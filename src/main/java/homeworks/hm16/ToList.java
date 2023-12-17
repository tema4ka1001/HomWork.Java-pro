package homeworks.hm16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToList {
    public static <T> List<T> toList(T[] array){
            return new ArrayList<>(Arrays.asList(array));
    }

}
