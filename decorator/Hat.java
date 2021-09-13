package decorator_design;
/**
 * Creates the class that puts the hat on the potato head
 */

public class Hat extends CharacterDecorator{
    /**
     * creates the hat that gets added to the potato head
     * @param character is the character that the hat goes on top of
     */
    public Hat(Character character){
        super(character);
        this.character = character;
        
    }
    /**
     * draws the hat and adds it to the potato head
     */
    public void customize(){
        sections.set(0,"    ____");
        sections.set(1," __|____|____");
    }
}
