Algoritmo MayoresMatrix
	Definir M, F, C , May Como Entero
	Dimension M[2,3]
	F<-1
	C<-1
	
	Repetir
	May<-M[1,1]
	Para F<-1 Hasta 2 Con Paso 1 Hacer
		Para C<-1 Hasta 3 Con Paso 1 Hacer
			Escribir " Ingrese un número entero para la fila ", F " columna ", C
			Leer M[F,C]
			Si M[F,C]>May Entonces
				May<-M[F,C]
			FinSi
		FinPara
	FinPara
	Escribir "El número MAYOR es: ", May
    Hasta Que F= 2 y C= 3
    May<-0
FinAlgoritmo
