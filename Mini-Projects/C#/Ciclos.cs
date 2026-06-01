namespace Ciclos
{ 
    class Program
    {

     
        static void Main(string[] args)
           
        {
            double valor;
            double suma = 0; 
            double promedio = 0;
        
            for (byte i = 0; i < 10; i++)
            {
                Console.WriteLine("Ingrese un número: ");
                valor = Convert.ToDouble(Console.ReadLine());
                suma = suma + valor;
                promedio = suma / 10;
            }
               
            Console.WriteLine("La suma es: " + suma);
            Console.WriteLine("El promedio es: " + promedio);
            Console.ReadKey();
        }
        
    }
}

        
