import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMode extends Actor
{
    private int s;
    private String level;
    private int rand;
    Circle circle1 = new Circle();
    Square square1 = new Square();
    Triangle triangle1 = new Triangle();
    Star star1 = new Star();
    Rectangle rectangle1 = new Rectangle();
    Diamond diamond1 = new Diamond();
    Shape[] easyShapes = {circle1, square1};
    Shape[] mediumShapes = {circle1,square1,rectangle1,triangle1};
    Shape[] hardShapes = {circle1,square1,rectangle1,triangle1,star1,diamond1};
    World world;
    
    public GameMode(String l){
        level = l;
        s = 0;
        world = getWorld();
    }
    
    public void easy(){
        rand = Greenfoot.getRandomNumber(2);
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
        if(rand == 1){
            
        }else{
            
        }
    }
    public void medium(){
        rand = Greenfoot.getRandomNumber(4);
    }
    public void hard(){
        rand = Greenfoot.getRandomNumber(6);
    } 
    public void setPosition(){
        
    }
    public void colorLevel(){
        
    }
    public void stat(){
        
    }
    private void find(){
        
    }
    
    
    /**
     * Act - do whatever the GameMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
