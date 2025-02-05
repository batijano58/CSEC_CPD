import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int targetRow = 2; // Target row (0-indexed)
        int targetCol = 2; // Target column (0-indexed)
        int currentRow = -1;
        int currentCol = -1;

        // Read the 5x5 matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int value = scanner.nextInt();
                if (value == 1) {
                    currentRow = i; // Store the row of '1'
                    currentCol = j; // Store the column of '1'
                }
            }
        }

        // Calculate the number of moves to the center
        int moves = Math.abs(currentRow - targetRow) + Math.abs(currentCol - targetCol);

        // Output the number of moves
        System.out.println(moves);
        
        // Close the scanner
        scanner.close();
    }
}
