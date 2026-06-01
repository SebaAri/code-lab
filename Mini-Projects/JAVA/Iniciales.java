package inicial;
import java.util.Scanner;
public class Iniciales {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String miNombre;
    int c =0;
           System.out.println("Ingrese un nombre: ");
     miNombre = lector.nextLine();
for (c =0; c< miNombre.length(); c++)
{
        System.out.println(miNombre.charAt(c)); 
}
}
    }