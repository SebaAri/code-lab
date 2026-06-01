Algoritmo calculadora
	Repetir
		Escribir "Ingrese la operación a realizar: suma, resta, multiplicacion, division, potencia, porcentaje ó term para terminar"
		Leer operacion
		Si operacion <> "term" Entonces
			Escribir "Ingrese un número: "
			Leer A
			Escribir "Ingrese otro número: "
			Leer B
		Fin Si
		Si operacion == "suma" Entonces
			sum<-A+B
			Escribir "La suma es = ",sum
		Fin Si
		Si operacion == "resta" Entonces
			res<-A-B
			Escribir "La resta es = ", res
		Fin Si
		Si operacion == "multiplicacion" Entonces
			multi<-A*B
			Escribir "La multiplicacion es = ", multi
		Fin Si
		Si operacion == "division" Entonces
			Si B <> 0 Entonces
				divi<-A/B
				Escribir "La division es = ", divi
			SiNo Si B == 0
					Escribir "No se puede dividir por 0"
				Fin Si
			FinSi
			
		Fin Si
		Si operacion == "potencia" Entonces
			pot<-A^B
			Escribir "La potencia es = ", pot
		Fin Si
		Si operacion == "porcentaje" Entonces
			porce<-A*B/100
			Escribir "El porcentaje es = ", porce
		Fin Si
	Hasta Que operacion == "term"
	Si operacion == "term" Entonces
		Escribir "Hasta luego!!"
	Fin Si
FinAlgoritmo
