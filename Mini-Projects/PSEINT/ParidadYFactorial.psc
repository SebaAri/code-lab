Funcion n<-Factorial(n)
	Para I<-1 Hasta n-1 Con Paso 1 Hacer
		n<-I*n
	FinPara
FinFuncion

Algoritmo ParidadYFactorial
	Definir n Como Real
	Repetir
		Escribir " Ingrese un número entero ó ingrese 0 para terminar:"
		Leer n
		
		Si n MOD 2 = 0 Entonces
			Escribir ,n " es número PAR"
		Sino Escribir ,n " es número IMPAR"
		FinSi
		Si n = 0 Entonces
			Escribir "El FACTORIAL de ", n " es= 1"
		SiNo Si n<0 y n <> 0 Entonces
			Escribir " No existe factorial de un número negativo"
		Sino Escribir "El FACTORIAL de ", n " es= ", Factorial(n)
		FinSi
		FinSi
	Hasta Que n = 0
FinAlgoritmo
