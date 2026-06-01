/*package ciclo_do_while;
import java.util.Scanner;
public class Ciclo_Do_While {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n;
       int c = 0;
       System.out.println("Ingrese un número: ");
       n = entrada.nextInt();
       do 
       { 
           System.out.println(c);
       c++;
           } 
       while (c<n);
      
    }
    
}
*/
/*package ciclo_do_while;
import java.util.Scanner;
public class Ciclo_Do_While {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
    int n;
    int c = 1;   
    int p;
System.out.println("Ingrese un número: ");
n = entrada.nextInt();
do
    {
        p = 2 *c - 2;
        System.out.println(p);
        c++;
    }while (c<n);

    }
}
    */

package ciclo_do_while;
import java.util.Scanner;
public class Ciclo_Do_While {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n;
       int s =0;
       int d;
       System.out.println("Ingrese un número: ");
n = entrada.nextInt();
do {
    d= n %10;
     s = s + d;       
    n = n/ 10;
}while(n>0);
System.out.println("La suma de los dígitos es: "+ s);
}
}