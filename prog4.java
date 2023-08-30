import java.util.*;
public class Pattern  {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }
            
            // Print numbers in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "   ");
            }
            
            System.out.println();
        }
        
    }
}
