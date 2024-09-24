// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * What the player sees when they lose the game.
 */
public class WinnerScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     */
    public WinnerScreen()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("You Win!", 180, 200);
    }

    /**
     * showTextWithBigBlackFont - describes how the "You Win!" text should look.
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
