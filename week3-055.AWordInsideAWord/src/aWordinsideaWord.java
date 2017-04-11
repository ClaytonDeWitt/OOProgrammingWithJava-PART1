import java.util.*;

public class aWordinsideaWord {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = reader.next();
        System.out.print("Type the second word: ");
        String secWord = reader.next();

        if(firstWord.contains(secWord)){
            System.out.println("The word '" + secWord + " '" + "is found in the word " + "'" +  firstWord + "'.");
        }
        else{
            System.out.println("The word '" + secWord + " '" + "is not found in the word " + "'" +  firstWord + "'.");

        }

    }
}
