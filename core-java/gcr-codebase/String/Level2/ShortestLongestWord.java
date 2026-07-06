import java.util.Scanner;

public class ShortestLongestWord {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitText(String text) {

        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[index++] = word;
                start = i + 1;
            }
        }

        return words;
    }

    public static String[][] getWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    
    public static int[] findShortestAndLongest(String[][] wordData) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordData.length; i++) {

            int currentLength = Integer.parseInt(wordData[i][1]);
            int shortestLength = Integer.parseInt(wordData[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordData[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] wordData = getWordLengthArray(words);

        int[] result = findShortestAndLongest(wordData);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");

        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t\t" + wordData[i][1]);
        }

        System.out.println("\nShortest Word : " +
                wordData[shortestIndex][0] +
                " (Length = " + wordData[shortestIndex][1] + ")");

        System.out.println("Longest Word  : " +
                wordData[longestIndex][0] +
                " (Length = " + wordData[longestIndex][1] + ")");

        sc.close();
    }
}
