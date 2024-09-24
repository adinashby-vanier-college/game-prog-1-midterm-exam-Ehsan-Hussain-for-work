// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * What the player sees when they launch the game.
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public PigWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig =  new  Pig();
        addObject(pig, 268, 273);
        Snake snake =  new  Snake();
        addObject(snake, 487, 508);
        Burgers burgers =  new  Burgers();
        addObject(burgers, 407, 68);
        Burgers burgers2 =  new  Burgers();
        addObject(burgers2, 442, 165);
        Burgers burgers3 =  new  Burgers();
        addObject(burgers3, 182, 468);
        Burgers burgers4 =  new  Burgers();
        addObject(burgers4, 92, 415);
        Burgers burgers5 =  new  Burgers();
        addObject(burgers5, 438, 369);
        Burgers burgers6 =  new  Burgers();
        addObject(burgers6, 366, 492);
        Burgers burgers7 =  new  Burgers();
        addObject(burgers7, 162, 120);
        Burgers burgers8 =  new  Burgers();
        addObject(burgers8, 88, 163);
        burgers6.setLocation(79, 62);
        burgers3.setLocation(245, 442);
        burgers4.setLocation(90, 351);
        burgers4.setLocation(144, 299);
        burgers4.setLocation(77, 426);
        burgers2.setLocation(488, 231);
        burgers.setLocation(356, 110);
        burgers2.setLocation(479, 187);
    }
}
