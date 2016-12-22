
import java.util.Scanner;

/** ArrayExample
 *  example of an array
 * @author micla1676
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //create an integer array with known values
        int[] myInts = {5,2,-3,10,7};
        
        //print the array
        for (int z = 0; z < 5; z = z + 1) {
            System.out.println(myInts[z]);
        }
        //multiply 2 spots together
        int product = myInts[0] * myInts[1];
        
        //set index 2 equal to product
        myInts[2] = product;
    
    
    //create an array to store 5 marks
    double[] marks = new double[5];
    
    //get user to fill the array
        for(int x = 0; x < marks.length; x = x + 1){
            System.out.println("please enter in mark " + (x + 1));
            marks[x] = input.nextDouble();
        }
        
    //print the array
    for (int y = 0; y < marks.length; y = y + 1){
            System.out.println(marks[y]);
        }
    
 //add all number using a loop
        //start a total at 0 
        double total = 0;
        //go through wach number
        
        for(int a = 0; a < marks.length; a++){
            //add the number into total
            total = total + marks [a];
        }
        //print total
        System.out.println(total);
        //print the average
        System.out.println("Your average is: " + total / marks.length);
        
        // 2d array
        char[][] grid = new char[3][3];
        //set spot 0,0 equal to x
        grid[0][0] ='x'; 
        //set spot 1,0 equal to y
        grid[1][0] ='y'; 
        //set spot 2,0 equal to z
        grid[2][0] ='z';   
        
}
}

