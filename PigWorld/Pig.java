// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * The payable actor.
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            transitionToWinnerScreen();
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * moveAndTurn - the pig move whenever you press one of the "awsd" keys.
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * eat - the Pig actor remove the Burgers actor on contact and plays the "eating" sound.
     */
    public void eat()
    {
        Actor burgers = getOneIntersectingObject(Burgers.class);
        if (burgers != null) {
            World world = getWorld();
            world.removeObject(burgers);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * isGameWon - checks if all the Burgers are gone.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burgers.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * transitionToWinnerScreen - transitions from PigWorld to WinnerScreen.
     */
    public void transitionToWinnerScreen()
    {
        World winnerScreen =  new  WinnerScreen();
        Greenfoot.setWorld(winnerScreen);
    }
}
