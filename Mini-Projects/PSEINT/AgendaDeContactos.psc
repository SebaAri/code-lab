Funcion n <-EsNumero(m)
	Definir resultado Como Logico
	Definir i, largo Como Entero
	largo <- Longitud(m)
	resultado <- Falso
	
	Si ((m > "0" y m <= "9") o (m = "10")) Entonces
		resultado <- Verdadero
		Para i <- 1 Hasta largo Con Paso 1
			Si No (Subcadena(m, i, i) >= "0" Y Subcadena(m, i, i) <= "9") Entonces
				resultado <- Falso
				n <- EsLetra(m)
			FinSi
		FinPara
		n <- ConvertirANumero(m)
    SiNo 
		resultado <- Falso
		n <-EsLetra(m)
	FinSi
Fin Funcion

Funcion resultado <- EsCaracterEspecial(m)
    Definir resultado Como Logico
	resultado <- Falso
	
    Si No ((m >= "A" Y m <= "Z") Y (m >= "a" Y m <= "z")) o No ((m > "0" Y m <= "9") o No(m = "10")) O No (m = "ñ") O No (m = "Ñ") O No (m = " ") Entonces
        resultado <- Verdadero
		Escribir " Error: No se puede convertir, la entrada no es un número válido."
		n<- Entrada(m)
		SiNo n <-EsLetra(m)
    FinSi
	
FinFuncion

Funcion n <-EsLetra(m)
	Definir resultado Como Logico
	
    resultado <- Falso
	Si ((m >= "A" Y m <= "Z") O (m >= "a" Y m <= "z") o (m = "ñ" o m = "Ñ") o m = "" o  m = " ") o No EsCaracterEspecial(m) Entonces
		resultado <- Verdadero
		Escribir " Error: No se puede convertir, la entrada no es un número válido."
		n<- Entrada(m)
	SiNo
				resultado <- EsDigito(m)
	FiNSi		
Fin Funcion

Funcion resultado <- EsDigito(m)
    Definir resultado Como Logico
	Definir nombreBuscado como cadena
	Dimensionar vec[10]
	Dimensionar tel[10]
	Dimensionar email[10]
	resultado <- Falso
	n <-EsNumero(m) 
	Repetir
			Si (n <= 10 o n >=1) Entonces
				Escribir " Número válido: ", n
			FinSi	
		Hasta Que (n <= 10 o n >=1)
		
		Para i<-1 Hasta n Con Paso 1 Hacer
			         Repetir
				    	Escribir "Ingrese nombre:"
						Leer vec[i]
					Hasta Que ((vec[i] >= "A" Y vec[i] <= "Z") o (vec[i] >= "a" Y vec[i] <= "z") o (vec[i] = "ñ" o vec[i] = "Ñ") o vec[i] = "" o  vec[i] = " ") 
				
					 Repetir	
						Escribir "Ingrese el telèfono:"
						Leer tel[i]
					Hasta Que (( tel[i] > "0" y tel[i] <= "9") o (tel[i] = "10"))
				
					  Repetir
					  Escribir "Ingrese el eMail: "
					  Leer email[i]
				
				      Hasta Que ( email[i] > "@")
			
				     resultado <- Verdadero
					 Escribir "Contacto agendado"
			FinPara
						Escribir "¿Desea buscar algùn contacto en la agenda?: s/n "
						leer a
						Si	a = "n" o a = "N"	Escribir " Gracias!!"   
						FinSi
					
						Si a = "s" o a = "S" Entonces
							
							Repetir
						    Escribir "Ingrese el nombre a buscar o digite * para salir al siguiente menu:"
							Leer nombreBuscado
							Para i<-1 Hasta n con paso 1 Hacer
							Si nombreBuscado = vec[i]Entonces
								resultado <- Verdadero
								Escribir "El nombre es:", vec[i]
								Escribir "Su telèfono es:", tel[i]
								Escribir " Y su eMail es:", email[i]
							FinSi
						    FinPara
						    Hasta Que nombreBuscado = "*"
						FinSi
					
					
					Repetir
						Escribir "¿Desea ver todos los contactos agendados?: s/n"
						Leer b
						Si b = "n" o b = "N" Escribir " Gracias!!"
						FinSi
						Si b = "s" o b = "S" Entonces
							Para i<-1 Hasta n Con Paso 1 Hacer
								Escribir "El nombre es:", vec[i]
								Escribir "Su telèfono es:", tel[i]
								Escribir "Y su eMail es: ", email[i]
							FinPara
						FinSi
					Hasta Que b = "n" o b= "N"

				
				Si (n > 10 o n < 0) Entonces
					Escribir "Ha superado el limite de la agenda"
					n<- Entrada(m)
				FinSi
FinFuncion

Funcion n<- Entrada(m)
	Mientras m = cadena o m <> numero Hacer
		Escribir "Ingrese la cantidad de contactos a agendar:"
		Leer m
		Repetir
			Repetir
			
				n<-Ingresar(m)
			
			Hasta Que n <= 10
			
		Hasta Que m <> cadena 
	FinMientras
FinFuncion

Funcion n<-Ingresar(m)
	Definir i, n, tel como Entero
	Definir a Como Caracter
	Dimensionar vec[10]
	Dimensionar tel[10]

	resultado <- EsDigito(m)
Fin Funcion

Algoritmo AgendaDeContactos
	Definir n, tel, i Como Entero
	Definir b Como Caracter
	Definir m, vec como cadena
	Dimensionar vec[10]
	Dimensionar tel[10]
	
	n<- Entrada(m)
FinAlgoritmo
