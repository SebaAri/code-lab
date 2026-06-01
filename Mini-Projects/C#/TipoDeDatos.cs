namespace TipodeDatos
{
    class Program
    {
        static void Main(string[] args)
        {
            byte variable = 23;
            char variable1 = 'c';
            string variable2 = "Vives en Argentina";
            bool variable4 = true;
            double peso;
            System.Console.WriteLine("Tu edad es de: " + variable);
            System.Console.WriteLine("Tu nombre empieza con: " + variable1);
            System.Console.WriteLine(variable2);
            System.Console.WriteLine("Tu tienes una hermana: " + variable4);
            System.Console.WriteLine("Escribe tu peso: ");
            peso = Convert.ToDouble(Console.ReadLine());

            if (peso >= 60)

                System.Console.WriteLine("Debes hacer dieta");

            else
                System.Console.WriteLine("Estás bien");

            System.Console.ReadKey();
        }
    }
}



