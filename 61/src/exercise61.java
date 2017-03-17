import java.util.*;

public class exercise61 {

    public static int countItems(ArrayList<String> list) {
        int counter = 0;
        for (String item : list) {
            counter++;
        }
        return counter;
    }


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Howdy");
        list.add("Hello");
        list.add("Hola");
        list.add("Hi Power");

        System.out.println("There are this many items in the list: ");
        System.out.println(countItems(list));

    }
}
