import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPageSecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverPageSecondLevel extends World
{

    /**
     * Constructor for objects of class OverPageSecondLevel.
     * 
     */
    public OverPageSecondLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Reset reset = new Reset();
        addObject(reset,344,401);
        Exit exit = new Exit();
        addObject(exit,610,400);
        showText("The shark ate you, you lose!", 490, 310);
        showText("YOUR SCORE: " + SecondLevel.score.getValue() + " points", 490, 340);
    }
}
