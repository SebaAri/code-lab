namespace Calculadora
{
    class Math
    {
        static void Main(string[] args)
         

        {
            
            double num1;
            double num2;
            byte operación;
            Console.WriteLine("Digite un número: ");
            num1 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Digite otro número: ");
            num2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Digite 1 para suma,2 para resta,3 para multiplicación ó 4 para división: ");
            operación = Convert.ToByte(Console.ReadLine());
            switch (operación)
                {
                case 1:
                    Console.WriteLine("El resultado de la suma es : " + (num1 + num2));
                   

                    break;
                case 2:
                   
                    Console.WriteLine("El resultado de la resta es: " + (num1 - num2));
                    break;

                case 3:
                   
                    Console.WriteLine("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                   
                    Console.WriteLine("El resultado de la división es: " + (num1 / num2));
                    break;
                    default:
                        Console.WriteLine("Elija los números: 1, 2, 3 ó 4 ");
                        break;
                    
                }
            Console.ReadKey();
        }
    }
}