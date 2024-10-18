import java.util.Scanner;

//https://www.youtube.com/watch?v=RJzcjZRWYZU
public class ProjectEliza {


  public static String firstWord(String sentence) {
      if(sentence.indexOf(" ") == -1) {
          return sentence.replace("!", "").replace("?", "").replace(".", "");
      }
      int indexOfFirstSpace = sentence.indexOf(" ");
      String word = sentence.substring(0, indexOfFirstSpace);
      return word;
  }
  public static String lastWord(String sentence) {
      if(sentence.indexOf(" ") == -1) {
          return sentence.replace("!", "").replace("?", "").replace(".", "");
      }
      int indexOfLastSpace = sentence.lastIndexOf(" ");
      String word = sentence.substring(indexOfLastSpace + 1, sentence.length());
      return word.replace("!", "").replace("?", "").replace(".", "");
  }
 
  public static void main(String[] args) {
      String userResponse;
      String restart = "Yes";
     
      Scanner sc = new Scanner(System.in);
     
      PromptBank prompt = new PromptBank();
     
     
      while(restart.equalsIgnoreCase("Yes")) {
          System.out.println("Hello, my name is Eliza. What is your name?");
          String userName = sc.next();
          System.out.println("Hello, " + userName + ". Tell me what is on your mind today in 1 sentence.");
         
          while (true) {
              userResponse = sc.nextLine();
                         
              if(!userResponse.isEmpty()) {
                 
                  if (userResponse.equalsIgnoreCase("EXIT")) {
                     
                      System.out.println("Do you want to run the session again?");
                      userResponse = sc.nextLine();
                      if(userResponse.equalsIgnoreCase("No")) {
                          System.out.println("Goodbye, until next time");
                          restart = "No";
                          break;
                      } else if(userResponse.equalsIgnoreCase("Yes")) {
                          restart = "Yes";
                          break;
                      }
                     
                  } else if(userResponse.charAt(userResponse.length() - 1) == '?') {
                     
                      String lastWord = lastWord(userResponse);
                      String firstWord = firstWord(userResponse);
                      System.out.println(prompt.getRandomQuestionTrunk(firstWord, lastWord));
                     
                  } else if(userResponse.charAt(userResponse.length() - 1) == '!') {
                     
                      String lastWord = lastWord(userResponse);
                      String firstWord = firstWord(userResponse);
                      System.out.println("WOW! Dramatic! " + prompt.getRandomStatementTrunk(firstWord, lastWord));
                     
                  } else if ((userResponse.charAt(userResponse.length() - 1) == '.' || Character.isLetter(userResponse.charAt(userResponse.length() - 1)))) {
                     
                      String lastWord = lastWord(userResponse);
                      String firstWord = firstWord(userResponse);
                      System.out.println(prompt.getRandomStatementTrunk(firstWord, lastWord));
                     
                  }
                 
              }
          }
      }
  }
}





