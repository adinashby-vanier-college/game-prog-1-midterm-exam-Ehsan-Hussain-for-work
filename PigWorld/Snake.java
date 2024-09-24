// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * The actor that kills the payable actor Pig.
 */
public class Snake extends Actor
{

    /**
     * Snake - makes the snake actor turn in random directions for the moveAround methode.
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameOver()) {
            transitionToLoserScreen();
        }
    }

    /**
     * moveAround - makes the snake actor move in random directions.
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * isGameOver - checks if all the Pig actor is gone.
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transitionToLoserScreen - transitions from PigWorld to LoserScreen.
     */
    public void transitionToLoserScreen()
    {
        World loserScreen =  new  LoserScreen();
        Greenfoot.setWorld(loserScreen);
    }

    /**
     * eat - the Snake actor remove the Pig actor on contact and plays the "lose" sound.
     */
    public void eat()
    {
        Actor Pig = getOneIntersectingObject(Pig.class);
        if (Pig != null) {
            World world = getWorld();
            world.removeObject(Pig);
            Greenfoot.playSound("lose.wav");
        }
    }
}
