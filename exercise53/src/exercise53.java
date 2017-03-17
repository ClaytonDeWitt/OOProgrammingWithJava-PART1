import java.util.*;

public class exercise53 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = kb.next();
        System.out.println("Length of the first part: ");
        int firstPart = kb.nextInt();
        System.out.println("Result: " + word.substring(0, firstPart));


    }

}
