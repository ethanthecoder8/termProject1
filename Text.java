import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    private String message;
    private int fontSize;
    
    public Text(String m, int f){
        message = m;
        fontSize = f;
        update();
    }
    
    private void update(){
        GreenfootImage image = new GreenfootImage(message,fontSize,Color.YELLOW,new Color(0,0,0,0));
        setImage(image);
    }
    public void setMessage(String m){
        message = m;
        update();
    }
    public void setFontSize(int size){
        fontSize = size;
        update();
    }
    public void eraseText(){
        setImage(new GreenfootImage(1,1));
    }
    
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
