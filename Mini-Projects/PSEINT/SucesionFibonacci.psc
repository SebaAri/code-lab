Algoritmo SucesionFibonacci
	Definir n1, n2, s, limit Como Entero
	n1<-0
	n2<-1
	
	Repetir
		Escribir " Ingrese el límite (Debe ser > 1) para la sucesión de Fibonacci"
		Leer limit
		Escribir ,n1
		Escribir ,n2
		
		Mientras s< limit Hacer
	
			s<- n1 + n2
				n1 <- n2
				n2<-s
				Escribir , n2
		
		FinMientras
	Hasta Que limit >=1
	
FinAlgoritmo
