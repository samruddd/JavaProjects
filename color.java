package color;

import java.util.Scanner;

public class color {
    private static Scanner s;

    public static void main(String args[]){
        int choice;
        System.out.println("Select any one color: 1.Pink\t2.Blue\t3.Green");
        s = new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            
            case 1 : System.out.println("You have selected : PINK");
                     break;
            case 2 : System.out.println("You have selected : BLUE");
                     break;
            case 3 : System.out.println("You have selected : GREEN");
                     break;
        }

    }  
}
