namespace Arreglos
{
    class Program
    {
        
        static void Main(string[] args)
        {
            
            string[] arreglo_n = new string[5];
            string[] arreglo_a = new string[5];
            string[] arreglo_e = new string[5];
            string [] arreglo_s = new string[5];


            for (int i = 0; i < 5; i++)
            {
                          
                Console.WriteLine("Escriba el nombre: ");
                arreglo_n[i] = Convert.ToString(Console.ReadLine());
                Console.WriteLine("Escriba el apellido: ");
                arreglo_a[i] = Convert.ToString(Console.ReadLine());
                Console.WriteLine("Escriba la edad: ");
                arreglo_e[i] = Convert.ToString(Console.ReadLine());
                Console.WriteLine("Escriba el sexo: ");
                arreglo_s[i] = Convert.ToString(Console.ReadLine());
                Console.WriteLine("-----------------------");
            }
            for (int i = 0; i < 5; i++)
            {

                Console.WriteLine("Nombre --> " + arreglo_n[i]);
                Console.WriteLine("Apellido --> " + arreglo_a[i]);
                Console.WriteLine("Edad --> " + arreglo_e[i]);
                Console.WriteLine("Sexo --> " + arreglo_s[i]);
                Console.WriteLine("-----------------------");
              
            }
            System.Console.ReadKey();
        }
    }
}
