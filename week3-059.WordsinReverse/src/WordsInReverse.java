import java.util.*;

public class WordsInReverse {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        String answer = "";
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a word: ");
            answer = reader.nextLine();
            words.add(answer);

            if (answer.isEmpty()) {
                Collections.reverse(words);
                System.out.print("You typed the following words: ");
                for (String word : words) {
                    System.out.println(word);
                }
                break;

            }
        }


    }
}

