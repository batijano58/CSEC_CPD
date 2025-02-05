import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of magnets
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Read the first magnet configuration
        String previousMagnet = scanner.nextLine();
        int groups = 1; // Start with one group for the first magnet
        
        // Iterate through the remaining magnets
        for (int i = 1; i < n; i++) {
            String currentMagnet = scanner.nextLine();
            // If the current magnet differs from the previous, it's a new group
            if (!currentMagnet.equals(previousMagnet)) {
                groups++;
            }
            previousMagnet = currentMagnet; // Update the previous magnet
        }
        
        // Output the number of groups
        System.out.println(groups);
        
        // Close the scanner
        scanner.close();
    }
}
