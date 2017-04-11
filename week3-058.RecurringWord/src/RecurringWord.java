import java.lang.reflect.Array;
import java.util.*;

public class RecurringWord {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        while(true){
        System.out.print("Type a word: ");
        String answer = reader.nextLine();
        if(words.contains(answer)){
            System.out.println("You gave the word " + answer + " twice.");
            break;
            }
            words.add(answer);
        }
    }
}
