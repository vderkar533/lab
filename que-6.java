import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer to display cubes from 1 to the given number: ");
        int limit = scanner.nextInt();

      
        if (limit < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
           
            System.out.println("Number  Cube");
            for (int i = 1; i <= limit; i++) {
                System.out.printf("%d      %d\n", i, i * i * i);
            }
        }

        
        scanner.close();
    }
}
