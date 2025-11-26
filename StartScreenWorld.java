import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreenWorld extends World
{

    /**
     * Constructor for objects of class StartScreenWorld.
     * 
     */
    public StartScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new StartButton(), 300,200);
    }
}
