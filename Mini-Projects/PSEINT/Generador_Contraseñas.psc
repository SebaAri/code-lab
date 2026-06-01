SubProceso Carac
	Definir array1 Como caracter
	Definir Max, Max1 Como Entero
	Max1<-54
	Dimensionar array1[Max1]
	Max<-1
	
	array1[1]<-["b"]
	array1[2]<-["c"]
	array1[3]<-["d"]
	array1[4]<-["e"]
	array1[5]<-["f"]
	array1[6]<-["g"]
	array1[7]<-["h"]
	array1[8]<-["i"]
	array1[9]<-["j"]
	array1[10]<-["k"]
	array1[11]<-["l"]
	array1[12]<-["m"]
	array1[13]<-["n"]
	array1[14]<-["o"]
	array1[15]<-["p"]
	array1[16]<-["q"]
	array1[17]<-["r"]
	array1[18]<-["s"]
	array1[19]<-["t"]
	array1[20]<-["u"]
	array1[21]<-["v"]
	array1[22]<-["w"]
    array1[23]<-["x"]
	array1[24]<-["y"]
	array1[25]<-["z"]
	array1[26]<-["/"]
	array1[27]<-["*"]
	array1[28]<-["-"]
	array1[29]<-["+"]
	array1[30]<-["@"]
	array1[31]<-["<"]
	array1[32]<-[">"]
	array1[33]<-["%"]
	array1[34]<-["#"]
	array1[35]<-["$"]
	array1[36]<-["!"]
	array1[37]<-["°"]
	array1[38]<-["("]
	array1[39]<-[")"]
	array1[40]<-["="]
	array1[41]<-["."]
	array1[42]<-[","]
	array1[43]<-[";"]
	array1[44]<-["¡"]
	array1[45]<-["?"]
	array1[46]<-["¿"]
	array1[47]<-["~"]
	array1[48]<-["["]
	array1[49]<-["]"]
	array1[50]<-["{"]
	array1[51]<-["}"]
	array1[52]<-["&"]
	array1[53]<-["^"]
    array1[54]<-["a"]
	
	Para I<-1 Hasta Max Con Paso 1 Hacer
	Escribir Concatenar(Mayusculas(array1[Azar(53)+1])+ array1[Azar(53)+1],array1[Azar(53)+1])+ Mayusculas(array1[Azar(53)+1]) + Concatenar(array1[Azar(53)+1],Mayusculas(array1[Azar(53)+1])) Sin Saltar
    FinPara
FinSubProceso

SubProceso   Numeros1(n Por Valor)
	Definir I, array, Num Como Entero
	Num<-1
	Dimensionar array[Num]

	Para I<-1 Hasta Num Con Paso 1 Hacer
		array[I]<-n*n*Azar(1000+n+1)*Azar(n+1)
		Escribir array[I] Sin Saltar
	FinPara
	
FinSubProceso

SubProceso Nume(n Por Valor)
	Definir arr, Num Como Entero
	Num<-1
	Dimensionar arr[Num]
	
	Para I<-1 Hasta Num Con Paso 1 Hacer
		arr[I]<-n*n*Azar(100+n+1)*Azar(n+1)
		Escribir arr[I] 
	FinPara
	
FinSubProceso

Algoritmo Generador_Contraseñas
	Definir n Como Real
	
	Repetir
		Escribir " Ingrese la cantidad de contraseñas a generar o ingrese 1 para terminar:"
		Leer n
		
		Escribir " La contraseña/s generada es:" 
		Para I<-1 Hasta n Con Paso 1 Hacer
			Si n >= 10 y n <= 16 Entonces
				Carac
				Nume(n)
				Carac
				Numeros1(n)
			SiNo
		         Numeros1(n) 
		         Carac
		         Nume(n)
		    FinSi
		FinPara
	Hasta Que n = 1
FinAlgoritmo
