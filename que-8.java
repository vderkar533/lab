import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of odd natural numbers to sum: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            
            int sum = n * n;

            
            System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);
        }

        
        scanner.close();
    }
}
