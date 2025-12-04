import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    private int width = getWidth();
    private int height = getHeight();
    World startWorld;
    private int stage;
    //private int rand;
    Button easy = new Button("Easy.png");
    Button medium = new Button("Medium.png");
    Button hard = new Button("Hard.png");
    Button colorHard = new Button("Colors.png");
    Back back = new Back();
    
    
    private enum stage{
        GAME_MENU, EASY, MEDIUM, HARD, COLOR_HARD;
    }
    Button[] buttonStage = {easy,medium,hard,colorHard};
    
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        stage = 0;
        addObject(easy, (width/4)+20, height/3);
        addObject(medium, (width-(width/4))-20, height/3);
        addObject(hard, (width/4)+20, height-(height/4));
        addObject(colorHard, (width-(width/4))-20, height-(height/4));
        addObject(back, 40,40);
    }
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game(World w)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        startWorld = w;
        stage = 0;
        addObject(easy, (width/4)+20, height/3);
        addObject(medium, (width-(width/4))-20, height/3);
        addObject(hard, (width/4)+20, height-(height/4));
        addObject(colorHard, (width-(width/4))-20, height-(height/4));
        addObject(back, 40,40);

    }
    private void menuVisible(boolean v){
        if (v){
            addObject(easy, (width/4)+20, height/3);
            addObject(medium, (width-(width/4))-20, height/3);
            addObject(hard, (width/4)+20, height-(height/4));
            addObject(colorHard, (width-(width/4))-20, height-(height/4)); 
        } else{
            removeObject(easy);
            removeObject(medium);
            removeObject(hard);
            removeObject(colorHard);
        }
    }
    private Button chosenLevel(){
        Button temp = null;    
        for (Button s : buttonStage){
            if (s.pressed()){
                temp = s;
            }
        }
        for (int i=0; i < buttonStage.length; i++){
            if (buttonStage[i]==temp){
                stage = i+1;
            }
        }
        return temp;
    }
    
    public void act(){
        if(back.pressed() && stage > 0){
            stage = 0;
            menuVisible(true);
        }else if (startWorld !=null && back.pressed() && stage == 0 ){
            Greenfoot.setWorld(startWorld);
        }
        
        if (chosenLevel() == easy){
            menuVisible(false);
            stage = 1;
        } else if (chosenLevel() == medium){
            menuVisible(false);
            stage = 2;
        } else if (chosenLevel() == hard){
            menuVisible(false);
            stage = 3;
        } else if (chosenLevel() == colorHard){
            menuVisible(false);
            stage = 4;
        }
    }
}
