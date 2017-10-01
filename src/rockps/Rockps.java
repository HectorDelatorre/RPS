import java.util.Scanner
import java.util.Random


package rockps;


public class Rockps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String choice, choice1;
        int num =0;
        Random r = new Random ();
        num = r.nextInt(3);
        
        System.out.println("choose rock, paper, or scissors");
        Scanner userChoice = new Scanner(System.in);
        choice1 = userChoice.next();
        choice = choice1.toLowerCase();
        
        
        switch  (num){
            case 0:
                String num1 = "rock";
                System.out.println("System chose rock");
                if (choice.matches (num1)){
                    System.out.println("Its a tie");
                    
                }
                
                else if (choice.matches("paper")){
                    System.out.println("you win");
                    
                }
                else if (choice.matches("scissors")){
                    System.out.println("you lose");
                    
                           
                   
                }
        }
        
                
    }
    
}
