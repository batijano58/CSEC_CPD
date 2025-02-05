import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of columns
        int n = scanner.nextInt();
        int[] cubes = new int[n];
        
        // Read the number of cubes in each column
        for (int i = 0; i < n; i++) {
            cubes[i] = scanner.nextInt();
        }
        
        // Sort the array of cubes
        Arrays.sort(cubes);
        
        // Output the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(cubes[i] + (i < n - 1 ? " " : ""));
        }
        
        // Close the scanner
        scanner.close();
    }
}
