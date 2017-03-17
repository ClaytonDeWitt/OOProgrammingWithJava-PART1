import java.util.*;

public class exercis59 {

    public static void main (String [] args) {

        Scanner kb = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Type a word: ");
            String word = kb.nextLine();
            words.add(word);

            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");

                break;
            }
        }
        Collections.reverse(words);
           for(String word: words){
            System.out.println(word);

            }
            }

        }

