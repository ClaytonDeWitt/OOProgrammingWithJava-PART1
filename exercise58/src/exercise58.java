import java.util.*;

public class exercise58 {

    public static void main (String []args){

        Scanner kb = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true){
            System.out.println("Type a word: ");
            String word = kb.nextLine();

            if(words.contains(word)){

                System.out.println("You gave the word " + word + " twice.");
                break;



            } words.add(word);
        }


    }

}
