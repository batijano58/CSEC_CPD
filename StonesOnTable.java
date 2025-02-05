import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of stones
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Read the string representing the colors of the stones
        String s = scanner.nextLine();
        
        int removals = 0;
        
        // Iterate through the stones and count removals
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                removals++;
            }
        }
        
        // Output the number of stones to remove
        System.out.println(removals);
        
        // Close the scanner
        scanner.close();
    }
}
