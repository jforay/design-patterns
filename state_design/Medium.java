import java.util.Random;

public class Medium implements State{
    private ArithemeticGame game;
    public Medium(ArithemeticGame game){
        //game = new ArithemeticGame();
        this.game = game;
        this.game.setState(game.getMediumState());
    }
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(50);
        return num;
    }
    public String getOperation(){
        Random rand = new Random();
        int num = rand.nextInt(3);
        if(num == 0)
            return " + ";
        else if(num == 1)
            return " - "; 
        else 
            return " * ";
        
    }
    public void levelUp(){
        this.game.setState(this.game.getHardState());
        System.out.println("You have been advanced to the hardest mode.");
    }
    public void levelDown(){
        this.game.setState(this.game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}
