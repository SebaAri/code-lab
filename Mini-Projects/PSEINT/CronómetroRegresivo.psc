Algoritmo cronometro
	Definir hora, minuto, segundoT Como Entero
	hora<-0
	minuto<-0
	segundoT<-0

	Escribir "Ingrese la hora (1-23), minuto/s (1-59) y segundo/s (1-59) para el cronómetro:"
	Escribir "Hora"
	Leer hora
	Escribir "Minuto/s:"
	Leer minuto
	Escribir "Segundo/s:"
	Leer segundoT
	
	Repetir
		Si hora >= 24 o hora < 0 Entonces
			Escribir "Debe ingresar la hora entre 1-23:"
			Escribir "Hora:"
			Leer hora
		FinSi	
		Si minuto >59 o minuto < 0 Entonces
			Escribir "Debe ingresar los minuto/s entre 1-59:"
			Escribir "Minuto:"
			Leer minuto
		FinSi	
		Si segundoT>59 o segundoT <0 Entonces
			Escribir "Debe ingresar los segundo/s entre 1-59:"
			Escribir "Segundos:"
			Leer segundoT
    	FinSi
	Hasta Que (hora < 24 o hora >=1) y (minuto <= 59 o minuto >=1) y (segundoT<=59 o segundoT>=1)	
	
	Mientras hora <= 23 Hacer
		Mientras minuto <= 59  Hacer
			Mientras segundoT <= 59 Hacer
				Limpiar Pantalla
				Si hora > 9 Entonces
					Escribir hora Sin Saltar
				SiNo
					Escribir "0", hora Sin Saltar
				Fin Si	
				      Si minuto > 9 Entonces
					    Escribir ":", minuto Sin Saltar
				      SiNo
					    Escribir ":0", minuto Sin Saltar
				      Fin Si	     
				          Si segundoT > 9 Entonces
					        Escribir ":", segundoT Sin Saltar
				          SiNo
					          Escribir ":0", segundoT sin saltar
				          Fin Si
						  Mientras segundoT = 0 y minuto <> 0 Hacer
							  segundoT<-60
							  minuto <- minuto -1
						  Fin Mientras
							   Mientras minuto = 1  y segundoT = 0 y hora >= 1 Hacer
								   
								  segundoT<-60
								  minuto<-0
							   FinMientras
								   Mientras hora >= 1 y minuto= 0 y segundoT = 0 Hacer
									   segundoT<-60
									
									  minuto<-60
									  minuto<-minuto -1
									  hora<-hora-1
								   FinMientras
								         mientras hora = 0 y minuto = 0 y segundoT = 0 Hacer
											 hora<-0
											 minuto<-0
											 segundoT<-0
								         FinMientras
								  
						SegundoT<-segundoT -1
				Esperar 1 segundo
			FinMientras
			segundoT<-0
			minuto <- minuto -1
		Fin Mientras
		minuto<-0
		hora<-hora -1
	Fin Mientras

FinAlgoritmo



