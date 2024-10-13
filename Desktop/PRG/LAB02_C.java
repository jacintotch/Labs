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
public class LAB02_C{
    public static void main (String[] args){
        int ini;
        int given;
        
        Scanner prom = new Scanner (System.in);
        System.out.print("Enter a number");
        given = prom.nextInt();
        
        for (ini=1; ini<=given; ini++){
            if( ini%2 != 0){
                System.out.println(ini);
            }
        }
    }
}