import java.util.*;

public class Adder {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.println("Type another number: ");
        int secondNumber = reader.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum of the numbers: " + sum);

    }
}
