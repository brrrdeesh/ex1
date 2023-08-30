import java.util.*;
public class Strconcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += i;
            if (i != n) {
                result += " ";
            }
        }
        
        System.out.println("Output: " + result);
        
    
}

}
