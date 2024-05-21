import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a number between 1 and 7 to find the corresponding weekday:");

        
        int dayNumber = scanner.nextInt();

        
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        } else {
           
            String day;
            switch (dayNumber) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
                default:
                    day = "Invalid day"; // This line is technically not necessary because of input validation above
            }

           
            System.out.println("The day of the week is: " + day);
        }

       
        scanner.close();
    }
}
