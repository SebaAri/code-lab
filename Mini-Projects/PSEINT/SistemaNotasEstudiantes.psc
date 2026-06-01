SubProceso Ingresar(n)
	Definir apellido, nombreBuscado, nota, notas como cadena
	Definir resultado como Logico
	Definir i, j,cantidadNotas, not como Entero
	Definir promedio como Real
	Dimensionar apellido[10]
	Dimensionar notas[5,10]
	Dimensionar nota1[5,10]
	Dimensionar cantidadNotas[10]
	resultado <- Falso
    
	Para i<-1 Hasta n con paso 1 Hacer
			
		Escribir " Ingrese nombre y apellido del alumno/a: ", i
		Leer apellido[i]
		
	    Si ((apellido[i] >= "A" Y apellido[i] <= "Z") o (apellido[i] >= "a" Y apellido[i] <= "z") o (apellido[i] = "ñ" o apellido[i] = "Ñ") o apellido[i] = "" o  apellido[i] = " ") Entonces
		   Repetir
			Escribir "¿Cuántas notas desea ingresar?: Màximo 10 notas"
			Leer nota
		   Hasta Que (nota > "0" y nota <= "9") o (nota = "10")
		       not <- ConvertirANumero(nota)
		       cantidadNotas[i] <- not
			   
		FinSi
	
		Para j <- 1 Hasta cantidadNotas[i] Con Paso 1 Hacer
			Repetir
            Escribir "Ingrese la nota ", j, ":" " del alumno/a:", apellido[i]
            Leer notas[i,j]
		    Hasta Que (notas[i,j] > "0" y notas[i,j] <= "9") o (notas[i,j] = "10")
		             nota1[i,j]  <- ConvertirANumero(notas[i,j])
		
			Si (( nota1[i,j] > 0 y nota1[i,j] <= 9) o (nota1[i,j] = 10)) Entonces
				resultado <- Verdadero
				
				Escribir " Alumno/a ingresado "	
				FinSi
			FinPara
	
		FinPara
		
			Escribir "¿Desea buscar algùn contacto en la agenda?: s/n "
			leer a
			
			Si	a = "n" o a = "N"	Escribir " Gracias!!"
			FinSi
			
			Si a = "s" o a = "S" Entonces
				Repetir
					Escribir "Ingrese el nombre a buscar o digite * para ir al menù principal:"
					Leer nombreBuscado
					resultado <- Falso
					
					Para i<-1 Hasta n con paso 1 Hacer
						Si nombreBuscado = apellido[i] Entonces
							resultado <- Verdadero
							Escribir "El alumno/a es: ", apellido[i]
							suma<-0
							Para j<-1 Hasta cantidadNotas[i]  con paso 1 Hacer	
								suma <- suma + nota1[i,j]
     						Escribir "La nota ", j, " es: ", notas[i,j]
							promedio<-suma / cantidadNotas[i]
							
						FinPara
						Escribir "El promedio es: ", promedio
						Si promedio >=4 Entonces
							Escribir "Alumno/a ", apellido[i] " APROBADO"
							SiNo Escribir "Alumno/a ", apellido[i] " DESAPROBADO"
						FinSi
			FinSi
					FinPara	
			Hasta Que nombreBuscado = "*"
			
	
		m<-nombreBuscado
	FinSi
FinSubProceso

Funcion Terminar(m)
	 Si (m <> "*") Entonces
		 n <-EsNumero(m)
	 FinSi
	 Si (m = "*") Entonces
		 Escribir "Adiòs!!"
	 FinSi
FinFuncion

Funcion n <-EsNumero(m)
	Definir resultado Como Logico
	Definir i, largo, n Como Entero
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
	    Ingresar(n)
		Si (n > 10 o n <= 0) Entonces
			Escribir "Error!, Ha superado el limite"
			SistemaNotasEstudiantes
		FinSi
	     
	SiNo
			resultado <- Falso
			n <-EsLetra(m)
		FinSi
Fin Funcion

Funcion resultado <- EsCaracterEspecial(m)
    Definir resultado Como Logico
	
    resultado <- Falso
	
    Si No ((m >= "A" Y m <= "Z") Y No (m >= "a" Y m <= "z")) o No ((m > "0" Y m <= "9") o No(m = "10")) O No (m = "ñ") O No (m = "Ñ") O No (m = " ") Entonces
        resultado <- Verdadero
	
		Escribir " Error: No se puede convertir, la entrada no es un número válido."
		SistemaNotasEstudiantes
	SiNo n <-EsLetra(m)
	
    FinSi
  
FinFuncion

Funcion n <-EsLetra(m)
	Definir resultado Como Logico
	
	
    resultado <- Falso
	
	Si ((m >= "A" Y m <= "Z") O (m >= "a" Y m <= "z") o (m = "ñ" o m = "Ñ") o (m = "") o  m = " ") o No EsCaracterEspecial(m) Entonces
		resultado <- Verdadero
		Escribir " Error: No se puede convertir, la entrada no es un número válido."
		SistemaNotasEstudiantes
    FiNSi
	
Fin Funcion

Algoritmo SistemaNotasEstudiantes
	Definir m como Cadena
    Repetir
	
		Escribir "Ingrese la cantidad de alumnos a anotar o digite * para terminar: "
		Leer m
		
		Terminar(m)
	Hasta Que (m = "*") 
FinAlgoritmo


