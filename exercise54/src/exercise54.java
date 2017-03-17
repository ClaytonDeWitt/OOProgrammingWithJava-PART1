import java.util.*;


public class exercise54 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = kb.next();
        System.out.println("Length of the end part: ");
        int endPart = kb.nextInt();

        int length = word.length();
        int index = word.indexOf(endPart);
        int charLength = word.charAt(endPart);

        System.out.println("Result: " + word.substring(endPart, charLength));


    }
}
