import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    private static final String TYPE = "Rectangle";
    
    public Rectangle(){
        super(TYPE);
    }
    public Rectangle(int x, int y){
       super(x,y,"White",TYPE);
    }
    public Rectangle(int x, int y, String color){
        super(color,TYPE);
    }
    
    /**
     * Act - do whatever the Rectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
}
