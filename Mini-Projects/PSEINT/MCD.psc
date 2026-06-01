Algoritmo MCD
	Definir a, b, c,d,e Como Entero
	
	Repetir
		Escribir " Ingrese un número entero positivo ó 1 para terminar:"
		Leer a
		Escribir " Ingrese otro número entero positivo ó 1 para terminar:: "
		Leer b
	
		Si a > b y a <> b Entonces
			Mientras a MOD b <> 0 Hacer
				c<- a MOD b
				a<-b
				b<-c
			FinMientras
			Si a > b Entonces
				Escribir " El MCD es:",b 
			FinSi
		SiNo Si b > a y b <> a Entonces
			Mientras b MOD a <> 0 Hacer
				c<- b MOD a
				b<-a
				a<-c
			FinMientras
			FinSi
				Si b>a Entonces
					Escribir " El MCD es:",a 
				FinSi
				d<-a
				e<-b
			    Si d = e Entonces
				Escribir " El MCD es:",d/e
			    FinSi	
    	FinSi
	Hasta Que a = 1 y b = 1 
FinAlgoritmo
