Algoritmo ArreglosPromedio
	Dimension M[2,3]
	Definir F,C,M,SUMA,CANT Como Entero
	SUMA<-0
	CANT<-0
	Para F<-1 Hasta 2 Con Paso 1 Hacer
		Para C<-1 Hasta 3 Con Paso 1 Hacer
			Escribir " Ingrese número de personas en el piso ", F " departamento ", C
			Leer M[F,C]
			SUMA<-SUMA+M[F,C]
			CANT<-CANT+1
			
		FinPara
	FinPara
	Para F<-1 Hasta 2 Con Paso 1 Hacer
		Escribir ""
		Para C<-1 Hasta 3 Con Paso 1 Hacer
			Escribir Sin Saltar, M[F,C] " " ;
		FinPara
	FinPara
	PROMEDIO<-SUMA/CANT
	Escribir ""
	Escribir " La SUMA de los números ingresados es de: ", SUMA
	Escribir " Entraron en PROMEDIO ", PROMEDIO " personas"
FinAlgoritmo
