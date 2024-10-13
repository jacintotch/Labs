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

public class Lab03_C{
    private static Scanner ask;
    
    public static void main (String[] args){
        
        ask = new Scanner (System.in);
        System.out.print("Enter the fisrt number");
        int num1 = ask.nextInt();
        
        System.out.print("Enter the Second Number:");
        int num2 = ask.nextInt();
        
        int difference = num1-num2;
        int product = num1*num2;
        
        System.out.print(difference+ " " + product);
    }
}
