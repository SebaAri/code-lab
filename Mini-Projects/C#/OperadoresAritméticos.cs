// See https://aka.ms/new-console-template for more information
int num = 6, num2 = 5;
double num1, pot, resultado;
System.Console.WriteLine("El resultado de la suma es:" + (num + num2));
System.Console.WriteLine("El resultado de la resta es:" + (num - num2));
System.Console.WriteLine("El resultado de la multiplicación es:" + (num * num2));
System.Console.WriteLine("El resultado de la división es:" + (num / num2));
System.Console.WriteLine("El resultado del residuo es:" + (num % num2));
System.Console.WriteLine("Digite el número que quiere elevar: ");
num1 = Convert.ToDouble(System.Console.ReadLine());   
System.Console.WriteLine("Digite a la potencia que quiere elevar: ");
pot = Convert.ToDouble(System.Console.ReadLine());
resultado = Math.Pow
System.Console.ReadKey();
