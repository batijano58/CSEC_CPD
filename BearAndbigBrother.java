import java.util.Scanner;

public class BearAndbigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the weights of Limak and Bob
        int a = scanner.nextInt(); // Limak's weight
        int b = scanner.nextInt(); // Bob's weight
        
        int years = 0;
        
        // Loop until Limak's weight is greater than Bob's weight
        while (a <= b) {
            a *= 3; // Limak's weight triples
            b *= 2; // Bob's weight doubles
            years++; // Increment the year count
        }
        
        // Print the number of years it takes
        System.out.println(years);
        
        scanner.close();
    }
}
