
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * 16/09/2016 Threading example
 *
 * @author micla1676
 */
public class ThreadingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the city
        City Suburbs = new City();
        // create the robots
        // they need to have the keyword 'final' infront for this to work
        final Robot Karel = new Robot(Suburbs, 3, 3, Direction.EAST);
        final Robot Marie = new Robot(Suburbs, 0, 1, Direction.WEST);

        //lable Marie
        Marie.setLabel("M");

        //lable Karel
        Karel.setLabel("K");
        //set color of Karel
        Karel.setColor(Color.BLUE);


        // A thread that determines Karel's movements
        Thread KarelThread = new Thread(new Runnable() {
            // what karel should be doing
            @Override
            public void run() {
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.move();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.turnLeft();
                Karel.move();
                Karel.move();
                Karel.turnLeft();
            }
        });

        // A thread that determines Marie's movements
        Thread MarieThread = new Thread(new Runnable() {
            // what Jeff should be doing
            @Override
            public void run() {
                Marie.move();
                Marie.turnLeft();
                Marie.move();
                Marie.turnLeft();
                Marie.move();
            }
        });

        // tell both threads to start running
        KarelThread.start();
        MarieThread.start();
    }
}
