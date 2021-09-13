package decorator_design;
/**
 * Creates the class that makes the mouth and puts it on the potato head
 */
public class Mouth extends CharacterDecorator{
    /**
     * creates the mouth that gets added to the potato head
     * @param character is the character that gets a mouth
     */
    public Mouth(Character character){
        super(character);
        this.character = character;
    }
    /**
     * draws the mouth and adds it to the potato head
     */
    public void customize(){
        sections.set(5, "  \\ ---- /");

    }
}
