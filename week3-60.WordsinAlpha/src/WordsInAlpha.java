import java.lang.reflect.Array;
import java.util.*;

public class WordsInAlpha {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true){
        System.out.print("Type a word: ");
        String answer = reader.nextLine();
        words.add(answer);

        if(answer.isEmpty()){
            Collections.sort(words);
            System.out.print("You typed the following words: ");

            for(String word : words){
                System.out.println(word);
            }
            break;
        }
        }

    }
}
