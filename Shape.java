import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shapes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shape extends Actor

{
    protected int x;
    protected int y;
    protected String img;
    private String color;
    protected World world = getWorld();
    protected GreenfootImage image = getImage();
    
    
    protected enum Size{
        SMALL, MEDIUM, LARGE
    }
    
    public Shape(){
        x = world.getWidth()/2;
        y = world.getHeight()/2;
    }
    public Shape(String color, String shape){
        x = world.getWidth()/2;
        y = world.getHeight()/2;
        setImage(img);
    }
    public Shape(int x, int y, String img){
        this.x = x;
        this.y = y;
        setImage(img);
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setSize(Size size){
        if(size==Size.SMALL){
            image.scale(100,100);
        } else if(size==Size.MEDIUM){
            image.scale(150,150);
        } else if(size==Size.LARGE){
            image.scale(200,200);
        }
        setImage(image);
    }
    
    /**
     * Act - do whatever the Shapes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
