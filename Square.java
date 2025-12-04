import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    private static final String TYPE = "Square";
    
    public Square(){
        super(TYPE, "Square.wav");
    }
    public Square(int x, int y){
       super(x,y,"White",TYPE, "Square.wav");
    }
    public Square(int x, int y, String color){
        super(color,TYPE, "Square.wav");
    }
    
    /**
     * Act - do whatever the Square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
