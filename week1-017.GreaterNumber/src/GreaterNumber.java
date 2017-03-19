import java.util.*;

public class GreaterNumber {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int secNum = Integer.parseInt(reader.nextLine());

        if(firstNum > secNum){
            System.out.println("Greater number: " + firstNum);
        }else if(secNum > firstNum){
            System.out.println("Greater number: " + secNum);
        }else if(firstNum == secNum){
            System.out.println("Numbers are equal!");
        }

    }
}
