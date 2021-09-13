package decorator_design;
/**
 * Creates the class that puts the nose on the potato head
 */

public class Nose extends CharacterDecorator{
    /**
     * creates the nose that gets added to the potato head
     * @param character is who the nose gets put on
     */
    public Nose(Character character){
        super(character);
        this.character = character;
    }
    /**
     * draws the nose that gets added to the potato head and adds it
     */
    public void customize(){
         this.sections.set(4," |   >    |");

    }

}
