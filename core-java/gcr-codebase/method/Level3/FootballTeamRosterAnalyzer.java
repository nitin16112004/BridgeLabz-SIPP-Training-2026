package method.Level3;
import java.util.*;

public class FootballTeamRosterAnalyzer {
    public static void main(String[] args) {
        int numberOfPlayers=11;
        int[] heights=new int[numberOfPlayers];
        Random random=new Random();

        for (int i=0;i<numberOfPlayers;i++){
            heights[i]=random.nextInt(101)+150;
        }

        System.out.println("Heights of players: "+Arrays.toString(heights));

        int sumOfHeights=sumOfHeights(heights);
        System.out.println("Sum of heights: "+sumOfHeights);

        double meanHeight=meanHeight(heights);
        System.out.println("Mean height: "+meanHeight);

        int shortestHeight=shortestHeight(heights);
        System.out.println("Shortest height: "+shortestHeight);

        int tallestHeight=tallestHeight(heights);
        System.out.println("Tallest height: "+tallestHeight);
    }
}
