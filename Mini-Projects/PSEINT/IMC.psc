Funcion im<-imc1(a,b)
	est<-a*a
	im<-b/est
FinFuncion

Algoritmo IMC
	Definir a,im,est Como Real
	Definir b Como Entero
	
	Repetir
		Escribir "Ingrese su estatura (m) o 1 para terminar:"
		Leer a
		Escribir "Ingrese su peso (Kg) o 1 para terminar:"
		Leer b
				
		Escribir "Su IMC es de: ", imc1(a,b)
		
		Si imc1(a,b) < 18.5 Entonces
			Escribir "PESO INFERIOR AL NORMAL!!"
		SiNo Si imc1(a,b) > 18.5 y imc1(a,b) < 24.5 Entonces
				Escribir "Normal"
			SiNo Si imc1(a,b) > 25.0 y imc1(a,b) < 29.9 Entonces
					Escribir "Peso superior al normal"
				SiNo Si imc1(a,b) > 30.0 Entonces
						Escribir "OBESIDAD!!"
				FinSi
			FinSi		
		FinSi
		FinSi
	Hasta Que a = 1 y b = 1
FinAlgoritmo
