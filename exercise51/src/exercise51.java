import java.util.*;

public class exercise51 {

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = kb.next();

        int length = 0;
        int count = 1;

        int charLength = name.length() -1;

        while(length <= charLength){

            System.out.println(count + ". character: " + name.charAt(length));
            length++;
            count++;

        }



        }


    }

