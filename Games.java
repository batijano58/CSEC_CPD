import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of teams
        int n = scanner.nextInt();
        
        // Arrays to hold home and guest uniform colors
        int[] homeColors = new int[n];
        int[] guestColors = new int[n];
        
        // Read the uniform colors for each team
        for (int i = 0; i < n; i++) {
            homeColors[i] = scanner.nextInt();
            guestColors[i] = scanner.nextInt();
        }
        
        // Counter for games where host team wears guest uniform
        int count = 0;
        
        // Simulate the games
        for (int i = 0; i < n; i++) { // Host team
            for (int j = 0; j < n; j++) { // Guest team
                if (i != j) { // Ensure it's not the same team
                    if (homeColors[i] == guestColors[j]) {
                        count++;
                    }
                }
            }
        }
        
        // Output the result
        System.out.println(count);
        
        // Close the scanner
        scanner.close();
    }
}
