import com.sun.deploy.util.StringUtils;

import java.util.*;



class exercise50 {

    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = kb.next();

        if(name.length()>2) {
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));


        }
        else return;
        }
    }

