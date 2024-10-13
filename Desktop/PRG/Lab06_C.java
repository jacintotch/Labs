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


public class Lab06_C {
    private static Scanner word;
    
     public static void main(String[] args) {
        
     // Initialized a String
       String str;
       
       word = new Scanner (System.in);
       str = word.nextLine();
       // Replaced the character sequence 'oot' with 'out'
       String replace = str.replace("oot", "out");
       String last = str.replace("oot", "out");
       String lastest = last.replace("ing", "ed");
       // Printed the Original String
       System.out.println("The Original String was: " +str);
       // Printed the Final String after replace() char sequence operation
       System.out.println("The Next String is: " +replace);
       System.out.println("The Last String is: " + last);
       System.out.println("The Latest String is: " + lastest);
       
     }
}

