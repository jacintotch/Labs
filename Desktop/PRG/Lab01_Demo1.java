/**
* I hereby acknowledge that the work handed in is my own original work. If I
* have quoted from any othersource this information has been correctly referenced.
* I also declare that I have read the Namibia University of Science and Technology
* Policies on Academic Honesty and Integrity as indicated in my course outline and
* the NUST general information and regulations - Yearbook 2024
*
* @author <Jacinto CelestinoTchayevala> <224084003>
*/
import java.util.Scanner;

public class Lab01_Demo1 {
    public static void main (String[] args) {
        int sum;
       Scanner sc = new Scanner (System.in);
        
        System.out.print("Insert first number");
        int num1 = sc.nextInt();
        
        System.out.print("Insert second number");
        int num2 = sc.nextInt();
        
        sum = num1 + num2;
        
        System.out.println(sum);
    }
}