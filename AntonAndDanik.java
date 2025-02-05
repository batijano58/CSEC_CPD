import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of games
        int n = scanner.nextInt();
        // Read the outcomes of the games
        String outcomes = scanner.next();
        
        int antonWins = 0;
        int danikWins = 0;
        
        // Count the wins for Anton and Danik
        for (int i = 0; i < n; i++) {
            if (outcomes.charAt(i) == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }
        
        // Determine the result and print it
        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        scanner.close();
    }
}
