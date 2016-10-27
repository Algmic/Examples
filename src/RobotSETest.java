
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micla1676
 */
public class RobotSETest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 1, 1,Direction.EAST);
        
        //karel moves forward
        karel.move();
        
        //karel turns around
        karel.turnAround();
        
        //karel moves forward
        karel.move();
        
        //karel turns right
        karel.turnRight();
        
        
        
        
        
        
        
    }
}
