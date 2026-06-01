package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        float num1;
        float num2;
        int operación;
        float suma;
        float resta;
        float multiplicación;
        float división;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = entrada.nextFloat();
        System.out.println("Ingrese otro número: ");
        num2 = entrada.nextFloat();
        System.out.println("Ingrese a continuación el número de la operación matemática a realizar: 1: suma, 2: resta, 3: multiplicación, 4: división: ");
        operación = entrada.nextInt();
        switch (operación)
        { case 1:
            suma = num1 + num2;
            System.out.println("El resultado de la suma es: "+suma);
            break;
          case 2:
            resta = num1 - num2;
            System.out.println("El resultado de la resta es: "+resta);
            break;
          case 3:
            multiplicación = num1 * num2;
             System.out.println("El resultado de la multiplicación es: "+multiplicación);
            break;
          case 4:
              división = num1 / num2;
              System.out.println("El resultado de la división es: "+división);
            break;
          default:
                System.out.println("No existe esa opción para realizar las operaciones matemáticas");
    }
    } 
}
