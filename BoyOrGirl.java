import java.util.HashSet;
import java.util.Scanner;

public class BoyAndGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the user name from input
        String username = scanner.nextLine().trim();
        
        // Use a HashSet to store distinct characters
        HashSet<Character> distinctCharacters = new HashSet<>();
        
        // Add each character of the username to the HashSet
        for (char c : username.toCharArray()) {
            distinctCharacters.add(c);
        }
        
        // Determine the gender based on the number of distinct characters
        if (distinctCharacters.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        // Close the scanner
        scanner.close();
    }
}
