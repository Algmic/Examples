
import java.util.Scanner;

/**Method examples
 *
 * @author micla1676
 */
public class MethodExamples {

    //create method
    public static void sayHello(){
       //say hi
        System.out.println("Hello world!");
    }
    
    //create method
    public static void sayHello(String name){
       //say hi
        System.out.println("Hello " + name + "!");
    }
    
    //create method
    public static double CalcRectArea(double length, double width){
        //calculate answer
        double answer = length * width;
        //return answer
        return answer;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //say hi
        sayHello();
        //say hi to Alex
        sayHello("Alex");
        
        //create scanner
        Scanner input = new Scanner (System.in);
        //ask for name
        System.out.println("Please enter your name");
        //store input as string
        String name1 = input.nextLine();
        
        //say hello
        sayHello(name1);
        
        //create double to store answer
        double area = CalcRectArea(2.5,2.0);
        //show user the answer
        System.out.println("Area is " + area);
        
        //ask for length
        System.out.println("Please input a length");
        double length = input.nextDouble();
        
        //ask for width
        System.out.println("Please input a width");
        double width = input.nextDouble();
        
        //create double to store answer
        area = CalcRectArea(length,width);
        
        //output answer
        System.out.println("The area is " + area);
        
        
    }
}
