import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Shape
{
    private static final String TYPE = "Star";
    
    public Star(){
        super(TYPE, "Star.wav");
    }
    public Star(int x, int y){
       super(x,y,"White",TYPE, "Star.wav");
    }
    public Star(int x, int y, String color){
        super(color,TYPE, "Star.wav");
    }
    
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
