import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        // Asks user for how many words
        System.out.print("How many words do you want to enter: ");
        int size = stdin.nextInt();

        // assign the size to an array
        String[] wordsArray = new String[size];

        // run a loop through the length of the size
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print("Enter a word: ");

            wordsArray[i] = stdin.next();
            System.out.print(wordsArray[i] + "\n");
        }

        // printing all the words on the final line
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print(wordsArray[i] + " ");
        }
    }
}