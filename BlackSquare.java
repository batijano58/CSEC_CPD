import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the calorie expenditures for each strip
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Read the sequence of strips
        String s = scanner.nextLine();
        
        // Total calories counter
        int totalCalories = 0;
        
        // Calculate total calories used
        for (char ch : s.toCharArray()) {
            int strip = ch - '1'; // Convert char to integers (0 for strip 1, 1 for strip 2, etc.)
            switch (strip) {
                case 0:
                    totalCalories += a1;
                    break;
                case 1:
                    totalCalories += a2;
                    break;
                case 2:
                    totalCalories += a3;
                    break;
                case 3:
                    totalCalories += a4;
                    break;
            }
        }
        
        // Output the total calories
        System.out.println(totalCalories);
        
        // Close the scanner
        scanner.close();
    }
}
