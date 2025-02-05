import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of events
        int n = scanner.nextInt();
        
        // Initialize counters
        int availableOfficers = 0;
        int untreatedCrimes = 0;
        
        // Process each event
        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();
            if (event == -1) {
                // A crime has occurred
                if (availableOfficers > 0) {
                    availableOfficers--; // An officer investigates the crime
                } else {
                    untreatedCrimes++; // No officer available
                }
            } else {
                // Officers have been recruited
                availableOfficers += event; // Increase available officers
            }
        }
        
        // Output the number of untreated crimes
        System.out.println(untreatedCrimes);
        
        // Close the scanner
        scanner.close();
    }
}
