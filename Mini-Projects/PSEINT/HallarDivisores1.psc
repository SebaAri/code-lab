Algoritmo HallarDivisores1
	Definir n0, n1, n2 , s Como Entero
	n1<-1
	n0<-0
	
	Repetir
	Escribir " Ingrese un número ó 1 para terminar"
	Leer n2
	
	Mientras n2>n0 Hacer
		s<-n0+n1
		n0<-s
		
		Si n2 MOD n2 = 0 y n2 MOD n0 = 0 o n2= impar o n0 = impar Entonces
			Escribir " Los DIVISORES de ", n2 " son ", n0
		FinSi
		
	FinMientras
	n0<-0
    Hasta Que n2 =1 
	
FinAlgoritmo
