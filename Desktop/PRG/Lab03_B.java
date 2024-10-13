/**
* I hereby acknowledge that the work handed in is my own original work. If I
* have quoted from any othersource this information has been correctly referenced.
* I also declare that I have read the Namibia University of Science and Technology
* Policies on Academic Honesty and Integrity as indicated in my course outline and
* the NUST general information and regulations - Yearbook 2022
*
* @author <Jacinto CelestinoTchayevala> <224084003>
*/
import java.util.Scanner;

public class Lab03_B {
    
private static Scanner sc;

public static void main(String[] args){ 
    int number;
    sc = new Scanner(System.in);
    System.out.print(" Please Enter any Number to Check whether it is Divisible by 5 and 11: ");
    number = sc.nextInt();
    
    if((number % 5 == 0) && (number % 11 == 0)){
        System.out.println("\n Given number " + number + " is Divisible by 5 and 11");}
        else {
            System.out.println("\n Given number " + number + " is Not Divisible by 5 and 11");
}

}
}