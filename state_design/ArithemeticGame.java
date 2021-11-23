import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;// = getEasyState();
    private State mediumState;// = getMediumState();
    private State hardState;// = getHardState();
    private State state;
    private int score;
    private Scanner reader;   

    public ArithemeticGame(){
        easyState = new Easy(this);
        mediumState= new Medium(this);
        hardState = new Hard(this);
        this.state = easyState;
        this.score = 0;
        reader = new Scanner(System.in);
    }
    public void pressQuestionButton(){
        int num1 = this.state.getNum();
        int num2 = this.state.getNum();
        String op = this.state.getOperation();
        String question = num1+" "+op+" "+num2+":";
        System.out.print(question);
        int answer = reader.nextInt();
        System.out.println("");
        if(op.equals(" + ")){
            if(num1 + num2 == answer){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Incorrect");
                score--;
            }
        }
        else if(op.equals(" - ")){
            if(num1 - num2 == answer){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Incorrect");
                score--;
            }
        }
        else if(op.equals(" * ")){
            if(num1 * num2 == answer){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Incorrect");
                score--;
            }
        }
        else if(op.equals(" / ")){
            if(num1 / num2 == answer){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Incorrect");
                score--;
            }
        }
        if (score >= 3){
            this.state.levelUp();
            score = 0;         
        }
        if (score <= -3) {
            this.state.levelDown();
            score = 0;           
        }
    }
    public void setState(State state){
        this.state = state;
    }
    public State getEasyState(){
        return easyState;
    }
    public State getMediumState(){
        return mediumState;

    }
    public State getHardState(){
        return hardState;
    }
}
