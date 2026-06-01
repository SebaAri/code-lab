package actividad_array;
import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        float array [] = new float [5];
        Scanner lector = new Scanner(System.in);
        int límite =5;
        for (int i=0;i<límite; i++)
        { System.out.println("Ingrese un número: ");
         array [i] = lector.nextFloat();
        }
        System.out.println("");
       
        for ( int i = array.length - 1; i >= 0 ; i--) {
             
            System.out.println(array[i]);
        }

       }
       
     }

