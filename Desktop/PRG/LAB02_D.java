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
public class LAB02_D{
    public static void main (String[] args){
        int num1;
        int sum = 0;
        int suma;
        
        Scanner giv = new Scanner (System.in);
        System.out.print("Please Enter any Number");
        num1 = giv.nextInt();
        
        
        for(int i=1; i<=num1; i++){
            if (i%2 == 0 ){
                sum += i;

            }
            
        }
        System.out.println(sum);
    }
}