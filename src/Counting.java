
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author micla1676
 */
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();

        //create robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        //create a counter variable
        int Count = 0;

        //counting using a while loop
        //loop 5 times
        while (Count < 5) {
            //move robot
            karel.move();
            //count 1 step
            Count = Count + 1;

        }
        karel.turnLeft();
        karel.turnLeft();

        for (int i = 0; i < 5; i = i + 1) {
            //move robot
            karel.move();
        }
    }
}
