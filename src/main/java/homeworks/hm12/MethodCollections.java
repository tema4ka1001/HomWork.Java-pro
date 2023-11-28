package homeworks.hm12;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodCollections {
    public static int countOccurance(AbstractList<String> list, String s) {
        int tnp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s)) {
            }
        }
        return tnp;
    }

    public static <T> List<T> toList(T[] t) {
        List<T> list = Arrays.asList(t);
        return list;
    }
    public static ArrayList<Integer> findUnique (ArrayList<Integer> integers) {
        ArrayList<Integer> arrayListI = new ArrayList<Integer>();
        arrayListI.add(integers.get(0));
        for (int i = 0; i < integers.size(); i++) {
            if (arrayListI.contains(integers.get(i))) {
                arrayListI.add(integers.get(i));
            }
        }
        return arrayListI;
    }
}


