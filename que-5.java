import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of natural numbers to display: ");
        int n = scanner.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;

           
            System.out.println("The first " + n + " natural numbers are:");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                sum += i;
            }

           
            System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);
        }

        
        scanner.close();
    }
}
