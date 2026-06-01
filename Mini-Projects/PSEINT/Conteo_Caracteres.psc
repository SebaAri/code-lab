Funcion c<-Con_Espacios(texto1 por Valor)
	i<-1
	
	Para i<-1 Hasta i Con Paso 1 Hacer
		c<-Longitud(texto1)
	FinPara
FinFuncion

Funcion d<-Sin_Espacios(texto1 por Valor)
	n<-0
	i<-1
	
	Para i<-1 Hasta Longitud(texto1) con paso 1 Hacer
		Si Subcadena(texto1,i,i) <> " " Entonces
			contador<-n +1
			n<-contador
		FinSi
	FinPara
	   d<-contador
  FinFuncion

Algoritmo Conteo_Caracteres
	Definir i,c,d,contador Como Entero
	Definir texto1 como cadena
	
	Repetir
		Escribir " Ingrese un texto para contar los caracteres que tiene o ingrese exit para terminar"
		Leer texto1
			
		Escribir " El texto ingresado con espacios tiene:", Con_Espacios(texto1) " caracteres"
		Escribir " El texto ingresado sin espacios tiene:", Sin_Espacios(texto1) " caracteres"
	Hasta Que texto1 = "exit"
FinAlgoritmo
