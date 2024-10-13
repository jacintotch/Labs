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

public class Lab03_A {

   private static Scanner Sc;

          public static void main(String[] args)

          {

                   int startNumber, endNumber;

                   Sc = new Scanner(System.in);           

                   System.out.println("\n Please Enter Start Number: ");

                   startNumber = Sc.nextInt();

                   System.out.println("\n Please Enter End Number: ");

                   endNumber = Sc.nextInt();

                   while(startNumber <= endNumber) {

                   System.out.print(startNumber + " ");

                             startNumber++;

                   }

          }

}