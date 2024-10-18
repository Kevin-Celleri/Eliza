package cmp168;
import java.util.Random;
//https://www.youtube.com/watch?v=Ak5EJgb0sQM
public class PromptBank {
    String [] questions;
    String [] statements;
    private final int DEFAULT_SIZE = 6;
   
    public PromptBank(){
        questions = new String[6];
        statements = new String[6];
    }
   
    public void populateStatementsArray(){
        statements[0] = "Tell me more about BLANK1 and BLANK2";
        statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
        statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
        statements[3] = "BLANK1 seems cool. Tell me more about BLANK2.";
        statements[4] = "BLANK1 and BLANK2 catch my attention. Tell me more.";
        statements[5] = "Seems like you love BLANK1. Tell me about BLANK2.";
    }
    public void populateQuestionsArray(){
        questions[0] = "Is there anything else about BLANK1 and BLANK2?";
        questions[1] = "Does BLANK1 bother you? How about BLANK2?";
        questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
        questions[3] = "How does BLANK1 make you feel? How about BLANK2?";
        questions[4] = "Which do you like more? BLANK1 or BLANK2?";
        questions[5] = "Do you think BLANK2 is better than BLANK1?";
       
    }
   
    public String getRandomStatementTrunk(String firstWord, String lastWord){
        Random r = new Random();
        int RandomInt = r.nextInt(DEFAULT_SIZE);
        return statements[RandomInt].replace("BLANK1", firstWord).replace("BLANK2", lastWord);
    }
    public String getRandomQuestionTrunk(String firstWord, String lastWord){
        Random r = new Random();
        int RandomInt = r.nextInt(DEFAULT_SIZE);
        return questions[RandomInt].replace("BLANK1", firstWord).replace("BLANK2", lastWord);
    }
   
    public static void main(String[] args) {
    }
}





