import java.util.Scanner;

public class TeamPro{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of problems
        int n = scanner.nextInt();
        int count = 0; // To count problems they will implement
        
        // Process each problem
        for (int i = 0; i < n; i++) {
            // Read the certainty of each friend
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // Count how many friends are sure
            int sureCount = petya + vasya + tonya;
            if (sureCount >= 2) {
                count++;
            }
        }
        
        // Output the total count
        System.out.println(count);
        
        // Close the scanner
        scanner.close();
    }
}
