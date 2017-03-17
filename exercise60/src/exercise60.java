import java.util.*;

public class exercise60 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true) {

            System.out.println("Type a word: ");
            String word = kb.nextLine();
            words.add(word);
            Collections.sort(words);

            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                break;
            }
        }

            for(String word: words){
                System.out.println(word);


            }


        }


    }

