import java.util.*;

public class SumoftheAges {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("");
        System.out.println("Type your name: ");
        String nameTwo = reader.nextLine();
        System.out.println("Type your age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());
        System.out.println("");


        int ageSum = age + ageTwo;


        System.out.println(name + " and " + nameTwo + " are " + ageSum + " years old in total.");

    }
}
