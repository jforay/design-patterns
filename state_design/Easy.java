import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;
    public Easy(ArithemeticGame game){
        //game = new ArithemeticGame();
        this.game = game;
        this.game.setState(game.getEasyState());
    }    
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        return num;
    }
    public String getOperation(){
        Random rand = new Random();
        int num = rand.nextInt(2);
        if(num == 0){
            return " + ";
        }
        else
            return " - "; 
        
    }
    public void levelUp(){
        this.game.setState(game.getMediumState());
        System.out.println("You have been advanced to Medium mode.");
    }
    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
