/**
 * @author Joe Foray 
 * Creates a class that has an array of questions with their correct answers
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;
/**
 * creates a new array called answers and put the question, possible answers, and correct answers in the array.
 * @param question the question
 * @param ans1 the first possible answer
 * @param ans2 the second possible answer
 * @param ans3 the third possible answer
 * @param ans4 the fourth possible answer
 * @param correctAnswer the correct answer
 */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        answers = new String[4];
        this.question = question;
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }
/**
 * prints out the question and the possible answers
 */
    public String toString(){
        System.out.println(question);
        
        System.out.println("1. "+answers[0]);
        System.out.println("2. "+answers[1]);
        System.out.println("3. "+answers[2]);
        System.out.println("4. "+answers[3]);
        return "";
        
    }
/**
 * 
 * @param userAnswer what the user thinks the correct answer is
 * @return if true it tells the program to print out the win message, if false it prints out the lose message
 */
    public boolean isCorrect(int userAnswer){
        if(userAnswer-1 == correctAnswer){
            //System.out.println("YAY! You got it right!");
            return true;  
        }
        else{
            //System.out.println("You got it wrong!");
            return false;
        }
        
    }
/**
 * returns a string giving the correct answer
 * @return correctAnswer 
 */
    public String getCorrectAnswer(){
        return "The correct answer is "+correctAnswer;
    }
}
