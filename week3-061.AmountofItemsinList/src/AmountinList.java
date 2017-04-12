import java.lang.reflect.Array;
import java.util.*;

public class AmountinList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("Ciao");
        list.add("Hellow");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));

    }


    private static int countItems(ArrayList<String> list) {
        int counter = 0;
        for (String item : list) {
            counter++;

        }
        return counter;
    }
}


