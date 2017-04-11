import java.util.*;

public class Words {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String answer = reader.nextLine();
            words.add(answer);
            if (answer.isEmpty()) {
                System.out.println("You typed the following words: ");
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            }

        }
    }
}
