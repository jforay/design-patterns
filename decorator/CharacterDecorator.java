package decorator_design;

import java.util.ArrayList;

/**
 * Creates an abstract class that decorates the characters
 */

public abstract class CharacterDecorator extends Character{
   protected Character character;
    /**
     * customizes the character by adding features to its face
     * @param character is the character that gets new features
     */
    
    public CharacterDecorator(Character character){
       ArrayList<String> sections = character.sections;
        this.sections = sections;
        customize();
        
    }
    /**
     * children have to create customize method that allows the character to become changed
     */
    public abstract void customize();
}
