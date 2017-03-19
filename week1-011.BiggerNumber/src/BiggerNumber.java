import java.util.*;

public class BiggerNumber {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());


        int biggerNumber = Math.max(firstNumber, secondNumber);
        System.out.println("");
        System.out.println("The bigger number of the two numbers given was: " + biggerNumber);

    }
}
