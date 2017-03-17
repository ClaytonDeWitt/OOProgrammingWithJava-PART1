import java.util.*;

public class exercise52 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = kb.next();

       String reverse = new StringBuilder(name).reverse().toString();
        System.out.println("In reverse: " + reverse);




    }
}
