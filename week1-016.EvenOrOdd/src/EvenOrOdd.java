import java.util.*;

public class EvenOrOdd {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        if(num % 2 == 0){
            System.out.println("Number " + num + " is even.");
        }else{
            System.out.println("Number " + num + " is odd.");
        }
    }
}

