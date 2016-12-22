
import java.util.Scanner;

/**
 *
 * @author micla1676
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
         * Use banana as the word.
         */
        
        
        
        //create scanner for input
        Scanner input = new Scanner(System.in);
        
        //scan in a word
        String word = input.nextLine();
        
        //change word to lowercase
        word = word.toLowerCase();
        
        //make some changes to string
        String changedWord = word.replace("a", "♫");
        
        
        //find the first n position
        int nposition = changedWord.indexOf("n");
        
        if(nposition != -1){
            //breaking the string apart
            //starts at the beginning, goes upto the n
            String beginning = changedWord.substring(0, 2);
           
            //start at the n, take everything after it
            String end = changedWord.substring(2);
            
            //reassemble
            changedWord = end + beginning + "ee";
        }
        
        //gets the length of the word
        int length = word.length();
        
        //walk through the characters using a loop
        int count = 0;
        for (int i = 0; i < length; i ++){
         //look at the character
            //is the character a "n"
            if(word.charAt(i) == 'n'){
                //count in
                count = count + 1;
            }
    }
        
        
        //check if word typed is hello
        if (word.equals("hello")){
            System.out.println("Hi");
        }
        
        System.out.println("The old word is " + word);
        
        System.out.println("The new word is " + changedWord);
        
        System.out.println("the n is at position " + nposition);
        
        System.out.println("There are " + count + " Ns");
    }
}
