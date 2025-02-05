import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String exhibitName = scanner.nextLine();
        
        // Initialize the starting position
        char current = 'a';
        int totalRotations = 0;
        
        // Calculate the total rotations needed
        for (char next : exhibitName.toCharArray()) {
            int clockwise = (next - current + 26) % 26; // Clockwise rotations
            int counterclockwise = (current - next + 26) % 26; // Counterclockwise rotations
            totalRotations += Math.min(clockwise, counterclockwise); // Add the minimum of both
            current = next; // Move to the next letter
        }
        
        // Output the total rotations
        System.out.println(totalRotations);
        
        // Close the scanner
        scanner.close();
    }
}
