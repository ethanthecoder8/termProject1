import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    public Circle(){
        super("White-Circle.png");
    }
    public Circle(int x, int y){
        super(x,y,"White-Circle.png");
    }
    public Circle(int x, int y, String img){
        super(x,y,img);
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
