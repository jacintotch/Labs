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

public class Lab08_D {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int i, size;
        
     
        System.out.print("Enter the total number of Elements: ");
        size = sc.nextInt();
        
        int[] arr = new int[size];
        
       
        System.out.print("Enter the Elements: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
     
        System.out.print("Please Enter Number to Search: ");
        int num = sc.nextInt();
        
        boolean found = false;
        
        for (i = 0; i < size; i++) {
            if (arr[i] == num) {
                System.out.println("The Index position = " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Number Not Found");
        }
    }
}
