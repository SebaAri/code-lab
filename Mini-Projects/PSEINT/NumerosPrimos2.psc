Algoritmo NumerosPrimos
	Definir n0,n1,n2, c ,c0,I , Max Como Entero
	Definir a Como Caracter
	Max<-1000
    n0<-0
	n1<-1
	c0<-0
	
	Repetir
		Escribir ""
	    Escribir " Este programa adivina cuales son los números primos "
		Escribir " hasta el 100 aleatoriamente ,luego presione cualquier "
		Escribir " tecla para continuar o presione * para terminar:"
		Leer a
		Para I<-1 Hasta Max Con Paso 1 Hacer
			n2<-Azar(100)+1
		FinPara
		Escribir ""
		Escribir n2
		Mientras n2>n0 Hacer
			s<-n0+n1
			n0<-s
			Si n2 MOD n2 = 0 y n2 MOD n0 = 0 o n2= impar o n0 = impar Entonces
				c<-c0+1
				c0<-c
			FinSi
	    FinMientras
		Si c0 < 3 y n2<> 1 y n2 <> 0 Entonces
			Escribir "ES número PRIMO"
		Sino 
			Escribir "Es número compuesto"
		FinSi
		n0<-0
		n2<-0
		c0<-0
    Hasta Que a = "*"
	
FinAlgoritmo
