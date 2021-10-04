import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * a trivia game that reads read questions and randomly asks them to the user
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
/**
 * creates the new trivia game and initializes the random, the reader, and the getTriviaQuestions
 * prints out a welcome message
 */
    private TriviaGame(){
        rand = new Random();
        reader = new Scanner(System.in);
        questions = DataLoader.getTriviaQuestions();
        System.out.println("Welcome to the Trivia Game");
    }
/**
 * creates an instance of a TriviaGame 
 * @return new instance of TriviaGame, or if there is already a TriviaGame it returns that
 */
    public static TriviaGame getInstance(){
        if(triviaGame == null){
            System.out.println("Creating a Trivia Game!");
           triviaGame = new TriviaGame(); 
        }
        return triviaGame;
    }
    /**
     * loops for every time the user says they want to play the game, 
     * if they do it calls play round and if not it prints out the user score and quits
     */
    public void play(){
        boolean play = true;
        
        while(play != false){
           
            System.out.println("(P)lay or (Q)uit: ");
            
            String answer = reader.nextLine();

            if(answer.equalsIgnoreCase("p")){
                playRound();
            }
            else if(answer.equalsIgnoreCase("Q")){
                System.out.println("You won "+score+" game(s)!");
                play = false;
            }
            else{
                System.out.println("Please enter the letter (P) or (Q)");
            }
            
        }

    }
/**
 * reads in a random question and has the user guess the answer.
 * if correct print out a win message and increase their score.
 * if incorrect print out a lose message 
 * @return true if the user got the answer correct, false if not
 */
    private boolean playRound(){
        Question question = questions.get(rand.nextInt(10));
        System.out.println(question.toString());
        int answer = reader.nextInt();
        reader.nextLine();
        if(question.isCorrect(answer)){
            System.out.println("YAY! You got it right!");
            score ++;
            return true;
            
        }
        else{
            System.out.println("You got it wrong!");
            return false;
        }
        
    }
}
