import java.util.*;

public class GuessingNumber {

    public static void main (String[] args){

    Scanner reader = new Scanner(System.in);
    int numberDrawn = drawNumber();


        int i = 0;
    while(true){
        i++;
        System.out.print("Guess a number: ");
        int answer = Integer.parseInt(reader.nextLine());
        if(answer == numberDrawn){
            System.out.println("Congratulations, your guess is correct!");
            break;

        } else if(answer < numberDrawn){
            System.out.println("The number is greater, guesses made: " + i);

        }
        else {
            System.out.println("The number is lesser, guesses made: " + i);
        }
    }


    }


    private static int drawNumber(){
        return new Random().nextInt(101);
    }
}
