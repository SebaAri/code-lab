SubProceso   f<-absoluto(a,b)
	f<-ABS(a*b)
FinSubProceso

Funcion g<-Mayora(a,b)
	Si a > b y a <> b Entonces
		Mientras a MOD b <> 0 Hacer
			c<- a MOD b
			a<-b
			b<-c
		FinMientras
		Si a > b Entonces
			g<-b
		FinSi
	FinSi
FinFuncion

Funcion h<-Mayorb(a,b)
    Si b > a y b <> a Entonces
		Mientras b MOD a <> 0 Hacer
			c<- b MOD a
			b<-a
			a<-c
		FinMientras
	FinSi
	Si b>a Entonces
		h<-a
	FinSi
FinFuncion

Algoritmo MCD
	Definir a, b, c,d,e ,f ,g,h Como Entero
	
	Repetir
		Escribir " Ingrese un número entero positivo ó 1 para terminar:"
		Leer a
		Escribir " Ingrese otro número entero positivo ó 1 para terminar:: "
		Leer b
		
		Si a > b Entonces
			Escribir " El mcm entre (",a "," b ") es = ",absoluto(a,b)/Mayora(a,b)
		FinSi
		
		Si b>a Entonces
			Escribir " El mcm entre (",a "," b ") es = ",absoluto(a,b)/Mayorb(a,b)
		FinSi
		
		Si a = b Entonces
			Escribir " El mcm entre (",a "," b ") es = ",a
    	FinSi
	Hasta Que a = 1 y b = 1 
FinAlgoritmo

