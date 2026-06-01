SubProceso Primos(n4)
	n0<-0
	n5<-1
	c0<-0

	Mientras n4 >n0 Hacer
		s<-n0+n5
		n0<-s
		Si n4 MOD n4 = 0 y n4 MOD n0 = 0 o n4 = impar o n0 = impar Entonces
			c<-c0+1
			c0<-c
		FinSi
	FinMientras
		Si c0 < 3 y n4 <> 1 y n4 <> 0 Entonces
			Escribir n4 ": ES PRIMO"
		SiNo
				Escribir n4 ": ES COMPUESTO"
		FinSi
FinSubProceso

Algoritmo Primos1
	Definir c,c0,n0,n4,n5,s,I, Max Como Entero
	Max<-10
	Para I<-1 Hasta Max Con Paso 1 Hacer
		n4<-Azar(100)+1

	Primos(n4)
    FinPara

FinAlgoritmo 
