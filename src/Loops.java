
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 *While loops and if loops
 *@author micla1676
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city
        City example = new City();

        //create robot
        Robot Karel = new Robot(example, 1, 1, Direction.EAST);

        //create wall
        new Wall(example, 1, 5, Direction.EAST);

        //create thing
        new Thing(example, 1, 3);

        //while loop with not condition
        while (Karel.frontIsClear()) {
            Karel.move();

            //check for something to pick up
            if (Karel.canPickThing()) {
                Karel.pickThing();
            }

        }
        //end of the loop 


        //turn robot around
        Karel.turnLeft();
        Karel.turnLeft();



        // alternate method
        while (Karel.frontIsClear()) {
            Karel.move();
            // or statement ||
            // and statement &&
            if (Karel.getAvenue() == 1 && Karel.getStreet() == 1) {
                Karel.move();

                break;
            } else if (!Karel.frontIsClear()) {
                Karel.move();
            }
            //alt. method 
            // while(Karel.getAvenue()!=1) {
            // Karel.move();



        }







    }
}
