import java.lang.reflect.Array;
import java.util.*;

public class RemoveLast {

    public static void main (String[] args){
        ArrayList<String> brothers = new ArrayList<>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers: ");
        System.out.println(brothers);
        Collections.sort(brothers);
        removeLast(brothers);

        System.out.println(brothers);


    }

    private static void removeLast(ArrayList<String> list){
        list.remove(list.size() - 1);
    }
}
