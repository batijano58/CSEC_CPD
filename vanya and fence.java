import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of friends and the height of the fence
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        
        // Variable to store the total width
        int totalWidth = 0;
        
        // Read the heights of the friends and calculate the total width
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            if (height > h) {
                totalWidth += 2; // If the friend is taller than the fence, he bends down
            } else {
                totalWidth += 1; // If the friend is within the height limit, he walks normally
            }
        }
        
        // Print the total width
        System.out.println(totalWidth);
        
        scanner.close();
    }
}
