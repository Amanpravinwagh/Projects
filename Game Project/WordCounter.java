import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.println("Enter a sentence or paragraph:");
        String input = scanner.nextLine();

        // Count words using the split method
        String[] words = input.split("\\s+");
        int wordCount = words.length;

        System.out.println("Word count: " + wordCount);

        scanner.close();
    }
}