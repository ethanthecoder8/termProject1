import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond extends Shape
{
    private static final String TYPE = "Diamond";
    
    public Diamond(){
        super(TYPE);
    }
    public Diamond(int x, int y){
       super(x,y,"White",TYPE);
    }
    public Diamond(int x, int y, String color){
        super(color,TYPE);
    }
    
    /**
     * Act - do whatever the Diamond wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
