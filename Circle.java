import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    private static final String TYPE = "Circle";
    
    public Circle(){
        super(TYPE, "Circle.wav");
    }
    public Circle(int x, int y){
       super(x,y,"White",TYPE, "Circle.wav");
    }
    public Circle(int x, int y, String color){
        super(color,TYPE, "Circle.wav");
    }
    
    
    /**
     * Act - do whatever the Circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
