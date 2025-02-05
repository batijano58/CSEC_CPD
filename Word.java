import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input word
        String s = scanner.nextLine();
        
        // Count uppercase and lowercase letters
        int upperCount = 0;
        int lowerCount = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        
        // Determine the case conversion based on the counts
        if (upperCount > lowerCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
        
        // Close the scanner
        scanner.close();
    }
}
