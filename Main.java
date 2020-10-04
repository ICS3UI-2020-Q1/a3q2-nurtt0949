import java.util.Scanner;

/**
 *This program names the animal by asking user its personalities
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user if animal has feathers
     System.out.println("Does the animal have feathers? (yes/no)");
     String featherAnswer = input.nextLine();
    //check to see feather Statements
     if(featherAnswer.equals("yes")){
    //see if the animal can swim
      System.out.println("Can the animal swim? (yes/no)")
      ;
      String swimAnswer = input.nextLine();
    //determin animal
      if(swimAnswer.equals("yes")){
       System.out.println("This is a duck");
      } else if(swimAnswer.equals("no")){
        System.out.println("This is a hen");
      }
     }
    //check to see feather Statements
     if(featherAnswer.equals("no")){
    //see if the animal can swim
      System.out.println("does the animal have legs? (yes/no)")
      ;
      String legsAnswer = input.nextLine();
    //determin animal
      if(legsAnswer.equals("yes")){
       System.out.println("This is a lizard");
      } else if(legsAnswer.equals("no")){
        System.out.println("This is a snake");
     }
     } 
     }
}
     
    

