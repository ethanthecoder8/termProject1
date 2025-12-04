import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Learning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Learning extends World
{
    private int width = getWidth();
    private int height = getHeight();
    Circle circle1 = new Circle();
    Square square1 = new Square();
    Triangle triangle1 = new Triangle();
    Star star1 = new Star();
    Rectangle rectangle1 = new Rectangle();
    Diamond diamond1 = new Diamond();
    Shape[] startShapes = {circle1,square1,triangle1,star1,rectangle1,diamond1};
    private int shapeRotation;
    Back back = new Back();
    Shape tempHold;
    World startWorld;
    Text word = new Text("",75);
    Button replay = new Button("Replay.png");
    
    
    /**
     * Constructor for objects of class Learning.
     * 
     */
    public Learning()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        shapeRotation = 0;
        addObject(circle1, width/6, (height/4)+35);
        addObject(square1, width/2, (height/4)+35);
        addObject(triangle1, width-(width/6), (height/4)+35);
        addObject(star1, width/6,height-(height/4));
        addObject(rectangle1, width/2, height-(height/4));
        addObject(diamond1, width-(width/6), height-(height/4));
        addObject(back, 40,40);
    }
    /**
     * Constructor for objects of class Learning.
     * 
     * @param w stores the world given
     */
    public Learning(World w)
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        startWorld = w;
        shapeRotation = 0;
        addObject(circle1, width/6, (height/4)+35);
        addObject(square1, width/2, (height/4)+35);
        addObject(triangle1, width-(width/6), (height/4)+35);
        addObject(star1, width/6,height-(height/4));
        addObject(rectangle1, width/2, height-(height/4));
        addObject(diamond1, width-(width/6), height-(height/4));
        addObject(back, 40,40);
    }
    
    private void resetShapes(){
        addObject(circle1, width/6, (height/4)+35);
        circle1.setLocation(width/6, (height/4)+35);
        addObject(square1, width/2, (height/4)+35);
        square1.setLocation(width/2, (height/4)+35);
        addObject(triangle1, width-(width/6), (height/4)+35);
        triangle1.setLocation(width-(width/6), (height/4)+35);
        addObject(star1, width/6,height-(height/4));
        star1.setLocation(width/6,height-(height/4));
        addObject(rectangle1, width/2, height-(height/4));
        rectangle1.setLocation(width/2, height-(height/4));
        addObject(diamond1, width-(width/6), height-(height/4));
        diamond1.setLocation(width-(width/6), height-(height/4));
        for(Shape change : startShapes){
            change.setSize("Medium");
        }
        removeObject(replay);
    }
    private void spotlight(Shape s){
        if (s != null){
            s.setLocation(width/2, (height/2)+40);
            s.setSize("Large");
            for(Shape check : startShapes){
                if (check != s){
                    removeObject(check);
                }
            }
        }
    }
    private void rotate(){
        if(shapeRotation==0){
            resetShapes();
            Shape.playedSound = false;
            word.eraseText();
            //removeObject(replay);
        } 
        if (shapeRotation == 1){
            resetShapes();
            spotlight(circle1);
            circle1.playSound();
            word.setMessage("Circle");
            addObject(replay, 525, 60);
            if (replay.pressed()){
                circle1.playSoundAgain();
            }
        }else if (shapeRotation == 2){
            resetShapes();
            spotlight(square1);
            square1.playSound();
            word.setMessage("Square");
            addObject(replay, 525, 60);
            if (replay.pressed()){
                square1.playSoundAgain();
            }
        }else if (shapeRotation == 3){
            resetShapes();
            spotlight(triangle1);
            triangle1.playSound();
            word.setMessage("Triangle");
            addObject(replay, 525, 60);
            if (replay.pressed()){
                triangle1.playSoundAgain();
            }
        }else if (shapeRotation == 4){
            resetShapes();
            spotlight(star1);
            star1.playSound();
            word.setMessage("Star");
            addObject(replay, 525, 60);
            if (replay.pressed()){
                star1.playSoundAgain();
            }
        }else if (shapeRotation == 5){
            resetShapes();
            spotlight(rectangle1);
            rectangle1.playSound();
            word.setMessage("Rectangle");
            addObject(replay, 525, 60);
            if (replay.pressed()){
                rectangle1.playSoundAgain();
            }
        }else if (shapeRotation == 6){
            resetShapes();
            spotlight(diamond1);
            diamond1.playSound();
            word.setMessage("Diamond");
            addObject(replay, 525, 60);
            if (replay.pressed()){
                diamond1.playSoundAgain();
            }
        }
        addObject(word, 300, 50);
        replay.setSize("medium");
    }
    private Shape chosenShape(){
        Shape temp = null;    
        for (Shape s : startShapes){
            if (s.pressed()){
                temp = s;
            }
        }
        for (int i=0; i < startShapes.length; i++){
            if (startShapes[i]==temp){
                shapeRotation = i+1;
            }
        }
        tempHold = temp;
        return temp;
    }
    
    public void act(){
        spotlight(chosenShape());
        //resetShapes();
        rotate();
        if(back.pressed() && shapeRotation > 0){
            shapeRotation = 0;
            resetShapes();
        }else if (startWorld !=null && back.pressed() && shapeRotation == 0 ){
            Greenfoot.setWorld(startWorld);
        }
    }
}
