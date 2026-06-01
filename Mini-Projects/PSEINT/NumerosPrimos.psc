Algoritmo numerosPrimos
	Definir n0, n1, n2 , s , c Como Entero
	n1<-1
	n0<-0
	c<-0
	
	Repetir
		Escribir " Ingrese un número ó 1 para terminar"
		Leer n2
		
	Mientras n2>n0 Hacer
			s<-n0+n1
			n0<-s
			
		Si n2 MOD n2 = 0 y n2 MOD n0 = 0 o n2= impar o n0 = impar Entonces
			c<-c+1
			Escribir " Los DIVISORES de ", n2 " son ", n0
		
		FinSi
		
	FinMientras
	      Si c<=2 y n2 <> 1 Entonces
		      Escribir " ES número PRIMO"
		  SiNo Escribir " ES número COMPUESTO "
	      FinSi
	n0<-0
	c<-0
		
	Hasta Que n2 =1 
FinAlgoritmo
