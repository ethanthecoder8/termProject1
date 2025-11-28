import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int x;
    private int y;
    private int length;
    private int width;
    
    /**
     * Creates a Button object
     * 
     * @param x the desired x position of the object 
     * @param y the desired y position of the object
     * @param img the desired image for the object 
     */
    public Button(int x, int y, String img){
        this.x = x; 
        this.y = y;
        setImage(img);
    }
    /**
     * Creates a Button object
     * 
     * @param x the desired x position of the object
     * @param y the desired y position of the object
     * @param img the desired image for the object 
     * @param l the desired length of the object 
     * @param w the desired width of the object 
     */
    public Button(int x, int y, String img, int l, int w){
        this.x = x; 
        this.y = y;
        setImage(img);
        GreenfootImage image = getImage();
        image.scale(l,w);
        setImage(image);
    }
    
    /**
     * If the Button is pressed, this removes it from the world
     * 
     * @param w the world to remove the button from 
     */
    public void removePressed(World w){
        if(Greenfoot.mousePressed(this)){
            w.removeObject(this);
        }
    }
    /**
     * Determines whether Button is pressed
     * 
     * @return boolean returns true if the button is pressed
     */
    public boolean pressed(){
        boolean result = false;
        if(Greenfoot.mousePressed(this)){
            result = true;
        }
        return result;
    }
    /**
     * This removes the button from the world
     * 
     * @param w the world to remove the button from 
     */
    public void remove(World w){
        w.removeObject(this);
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
