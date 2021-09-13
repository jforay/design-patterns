package decorator_design;

/**
 * Creates the class that prints out a blank potato head shape
 * @author Joe Foray
 */
public class PotatoeHead extends Character {
    /**
     * creates the blank potato head
     */
    public PotatoeHead(){
        super();
        
        this.sections.add(0,"        ");
        this.sections.add(1,"    ____ ");
        this.sections.add(2,"  /      \\");
        this.sections.add(3," |        |");
        this.sections.add(4," |        |");
        this.sections.add(5,"  \\      /");
        this.sections.add(6,"   \\____/");
    }
    
}
