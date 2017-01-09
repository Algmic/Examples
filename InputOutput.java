
import java.util.Scanner;

/**
 *
 * @author micla1676
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the input for the user
        Scanner input = new Scanner(System.in);
        
        //ask user for their name
        System.out.println("Please enter your name");
        
        //get the name from the user
        String name = input.nextLine();
        
        //say Hello
        System.out.println("Hello " + name);
        
        //ask for user's year of birth
        System.out.println("Please enter your year of birth");
        // hint* use sout + tab to print the above line out more quickly
        
        //get year of birth from user
        int birthYear = input.nextInt();
        
        //calculate age
        int age = 2016 - birthYear;
        
        //tell the user their age
        System.out.println("You are " + age + " years old");

        if (age > 30){
            System.out.println("You are old");
        }else if (age > 10 && age < 30){
            System.out.println("cake");
        }
    }
}
