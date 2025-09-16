
import java.util.*;

public class RockPaperScissors {

    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) {
            return "Draw";
        }
        if ((user.equals("rock") && comp.equals("scissors"))
                || (user.equals("paper") && comp.equals("rock"))
                || (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, games;

        System.out.print("Enter number of games: ");
        games = sc.nextInt();

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            System.out.println("Game " + i + " -> User: " + user + ", Computer: " + comp + " => " + winner);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                compWins++;
            }
        }

        System.out.println("\nTotal Games: " + games);
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / games));
        System.out.println("Computer Win %: " + (compWins * 100.0 / games));
        sc.close();
    }
}
