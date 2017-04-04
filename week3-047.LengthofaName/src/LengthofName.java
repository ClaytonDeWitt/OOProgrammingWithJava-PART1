import java.util.*;

public class LengthofName {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.next();
        System.out.println("Number of characters: " + calculateCharacters(name));

    }
    private static int calculateCharacters(String text){

        int length = text.length();
        return length;


    }




    }
