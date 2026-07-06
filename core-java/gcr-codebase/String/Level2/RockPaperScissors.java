import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercentage);

        return stats;
    }

    public static void displayStats(String[][] stats) {

        System.out.println("\nStatistics");
        System.out.println("--------------------------------");
        System.out.println("Player\t\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();

        String[][] gameResults = new String[totalGames][4];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        System.out.println("\nGame Results");
        System.out.println("------------------------------------------------");
        System.out.println("Game\tUser\t\tComputer\tWinner");

        for (int i = 0; i < totalGames; i++) {
            System.out.println(
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2] + "\t\t" +
                    gameResults[i][3]);
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);

        displayStats(stats);

        sc.close();
    }
}