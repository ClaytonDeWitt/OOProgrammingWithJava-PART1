import java.util.*;;


public class sumOfNumbers {

    public static int sum(int n1, int n2, int n3, int n4) {

        Scanner kb = new Scanner(System.in);


       for(int i = 1; i<3; i++) {
            System.out.println("First number?");
            n1 = kb.nextInt();
            i++;
            System.out.println("Second number?");
            n2 = kb.nextInt();
            i++;
            System.out.println("Third number?");
            n3 = kb.nextInt();
            i++;
            System.out.println("Forth number?");
            n4 = kb.nextInt();
            i++;

        }
return sum(n1, n2, n3, n4);
    }



    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);

    }
}

