/**
* I hereby acknowledge that the work handed in is my own original work. If I
* have quoted from any othersource this information has been correctly referenced.
* I also declare that I have read the Namibia University of Science and Technology
* Policies on Academic Honesty and Integrity as indicated in my course outline and
* the NUST general information and regulations - Yearbook 2022
*
* @author <SHANINGWA> <220117330>
*/
import java.util.Scanner;

public class Lab04_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        // Iterate to collect numbers and sum them up
        while (true) {
            number = scanner.nextInt(); // Read the next number
            
            if (number <= 0) { // Stop if the number is non-positive
                break;
            }
            
            sum += number; // Add positive number to sum
        }

        System.out.println(sum); // Print the sum
    }
}
