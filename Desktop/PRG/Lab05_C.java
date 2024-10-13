/**
* I hereby acknowledge that the work handed in is my own original work. If I
* have quoted from any othersource this information has been correctly referenced.
* I also declare that I have read the Namibia University of Science and Technology
* Policies on Academic Honesty and Integrity as indicated in my course outline and
* the NUST general information and regulations - Yearbook 2024
*
* @author <Jacinto CelestinoTchayevala> <224084003>
*/

import java.util.Scanner; // Needed for the Scanner class
public class Lab05_C {
    private static Scanner numb;
    public static void main(String args[]) {
        int x;
        int y;
        numb = new Scanner (System.in);
        x = numb.nextInt();
        y = numb.nextInt();
        
        do {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
            
        }
        while( x < y );
}
}