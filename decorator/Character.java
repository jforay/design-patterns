package decorator_design;

import java.util.ArrayList;
/**
 * Creates an abstract class  of characters
 * @author Joe Foray
 */
public abstract class Character {
    protected ArrayList<String> sections;
    /**
     * initializes the character
     */
    public Character(){
        sections = new ArrayList<String>();
    }
    /**
     * creates the draw method that draws the character to the output
     */
    public void draw(){
        for(int i = 0; i < sections.size(); i++){
            System.out.println(sections.get(i));
        }
    }
 
}
