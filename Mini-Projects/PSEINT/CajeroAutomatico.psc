Función A <- Nomb(A)
	Escribir 'Digite 1 para CONSULTAR SALDO'
	Escribir 'Digite 2 para DEPOSITAR SALDO'
	Escribir 'Digite 3 para RETIRAR SALDO'
	Escribir 'Digite 4 para SALIR'
	Leer A
FinFunción

Algoritmo CajeroAutomatico
	Definir dni, dn, A, sal, ret, saldo Como Entero
	Definir contra, cont Como Cadena
	dni <- 123456789
	cont <- 'abcdef'
	c <- 0
	d <- 0
	saldo <- 200000
	Repetir
		Escribir 'Ingrese DNI:'
		Leer dn
		c <- c+1
		Escribir 'Ingrese contraseña:'
		Leer contra
		d <- d+1
		Si (c==2 Y d==2) Y (dni<>dn O contra<>cont) Entonces
			Escribir 'Le queda 1 intento'
		FinSi
	Hasta Que (dni==dn Y contra==cont) O (c==3 Y d==3)
	Si dni==dn Y contra==cont Entonces
		Escribir '###################'
		Escribir '# BIENVENIDO ARIEL#'
		Escribir '###################'
		A <- Nomb(A)
	FinSi
	Repetir
		Según A Hacer
			1:
				Escribir 'Su SALDO actual es de: ', saldo
				A <- Nomb(A)
			2:
				Escribir 'Ingrese la cantidad a DEPOSITAR:'
				Leer sal
				saldo <- saldo+sal
				Escribir 'El depósito es de: ', sal
				Escribir 'Su nuevo SALDO actual es de: ', saldo
				A <- Nomb(A)
			3:
				Escribir 'Ingrese la cantidad a RETIRAR: '
				Leer ret
				Si ret>saldo Entonces
					Escribir 'El retiro es de :', ret
					Escribir 'No tiene fondos suficientes'
					Escribir 'Su SALDO actual es de: ', saldo
					A <- Nomb(A)
				SiNo
					Si ret<saldo Entonces
						saldo <- saldo-ret
						Escribir 'El retiro es de :', ret
						Escribir 'Su SALDO actual es de: ', saldo
						A <- Nomb(A)
					FinSi
				FinSi
		FinSegún
	Hasta Que A==4
	Escribir 'Hasta luego!!!'
FinAlgoritmo
