import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle extends Shape
{
    private static final String TYPE = "Triangle";
    
    public Triangle(){
        super(TYPE);
    }
    public Triangle(int x, int y){
       super(x,y,"White",TYPE);
    }
    public Triangle(int x, int y, String color){
        super(color,TYPE);
    }
    
    /**
     * Act - do whatever the Triangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
