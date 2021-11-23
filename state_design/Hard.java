import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;
    public Hard(ArithemeticGame game){
        //game = new ArithemeticGame();
        this.game = game;
        this.game.setState(game.getHardState());
    }
    public int getNum(){
        Random rand = new Random();
        int num = rand.nextInt(100);
        return num;
    }
    public String getOperation(){
        Random rand = new Random();
        int num = rand.nextInt(4);
        if(num == 0)
            return " + ";
        else if(num == 1)
            return " - "; 
        else if( num == 2)
            return " * ";
        else 
            return " / ";
        
    }
    public void levelUp(){
        System.out.println("You are doing so well!!");
    }
    public void levelDown(){
        this.game.setState(this.game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }
}
