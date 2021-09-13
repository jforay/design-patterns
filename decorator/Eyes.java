package decorator_design;

/**
 * Creates the class that adds eyes to the potato head
 */

public class Eyes extends CharacterDecorator{
    /**
     * creates the eyes that get added to the potato head
     * @param character the character that gets eyes
     */
    public Eyes(Character character){
        super(character);
        this.character = character;
    }
    /**
     * draws the eyes and adds them to the potato head
     */
    public void customize(){
        this.sections.set(3, " |  o  o  |");
    }
}
