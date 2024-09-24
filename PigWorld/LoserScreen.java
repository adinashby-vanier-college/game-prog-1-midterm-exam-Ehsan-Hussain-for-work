// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * What the player sees when they win the game.
 */
public class LoserScreen extends World
{

    /**
     * Constructor for objects of class GameOverScreen.
     */
    public LoserScreen()
    {
        super(560, 560, 1);
        showTextWithBigRedFont("Game Over!", 180, 200);
    }

    /**
     * showTextWithBigBlackFont - describes how the "Game Over!" text should look.
     */
    public void showTextWithBigRedFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
