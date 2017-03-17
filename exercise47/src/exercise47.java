import java.util.*;

public class exercise47 {

    public static void main (String [] args){

    Scanner kb = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = kb.next();

    System.out.println("Number of characters: " + calculateCharacters(name));



}


public static int calculateCharacters(String name){
        return name.length();


}


}
