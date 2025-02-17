// simplify with for loops
import java.util.Random;
import java.util.Scanner;

public class RockPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"rock", "paper", "scissors"};
        String computerChoice = options[random.nextInt(options.length)];
        
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();
        
        String winner = "";
        
        if (userChoice.equals(computerChoice)) {
            winner = "It's a tie!";
        } else if (userChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                winner = "You win!";
            } else {
                winner = "Computer wins!";
            }
        } else if (userChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                winner = "You win!";
            } else {
                winner = "Computer wins!";
            }
        } else if (userChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                winner = "You win!";
            } else {
                winner = "Computer wins!";
            }
        } else {
            winner = "Invalid choice. Please choose rock, paper, or scissors.";
        }
        
        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        System.out.println(winner);
        
        scanner.close();
    }
}