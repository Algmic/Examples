
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micla1676
 */
public class robotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City kw = new City();

        //create a robot
        Robot karel = new Robot(kw, 3, 4, Direction.EAST);
        Robot mark = new Robot(kw, 3, 6, Direction.EAST);
        Robot chicken = new Robot(kw, 3, 6, Direction.EAST);

        //create walls
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);


        //thing
        new Thing(kw, 3, 5);

        //set speed of Mark
        mark.setSpeed(999999999);
        //lable mark
        mark.setLabel("M");
        //set color of mark
        mark.setColor(Color.BLUE);
        // set transparency
        mark.setTransparency(0.5);

        //lable karel
        karel.setLabel("K");
        // set transparency
        karel.setTransparency(0.5);

        //lable chicken
        chicken.setLabel("C");
        // set transparency
        chicken.setTransparency(0.5);
        //set color of chicken
        chicken.setColor(Color.WHITE);

        //get karel to move
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putThing();

        //get chicken to move
        //create a variable to stop movement
        int movesf = 0;

        while (movesf < 5) {
            chicken.turnLeft();
            chicken.turnLeft();
            chicken.move();
            chicken.move();
            chicken.move();
            chicken.move();
            chicken.move();
            chicken.move();
            movesf = movesf + 1;
        }

        //get mark to move
        //create a variable to stop movement
        int moves = 0;

        while (moves < 999999999) {

            mark.move();
            mark.turnLeft();
            //add 1 to movement counter
            moves = moves + 1;
        }


    }
}
