import java.util.*;

public class Factorial {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        int counter = 1;
        int sum = 1;

        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());

        while(counter <= input){
            sum = sum * counter;
            counter++;
        }
        System.out.println("Factorial is " + sum);
    }
}
