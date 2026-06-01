# Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


# En python no hay forma de elegir como pasar una variable a una
# funcion (por referencia o por valor). Las variables "inmutables"
# (str, int, float, bool) se pasan siempre por copia mientras que
# las demas (listas, objetos, etc.) se pasan siempre por referencia.
# Esto coincide con el comportamiento por defecto en pseint, pero
# cuando utiliza las palabras clave "Por Referencia" para
# alterarlo la traducción no es correcta.

import random

def inicio(letra):
	resultado = str()
	letra = str()
	acierto = bool()
	intentos = int()
	i = int()
	largo = int()
	total = int()
	indice = int()
	
	palabras = [str() for i in range(5)]
	palabras[0] = "python"
	palabras[1] = "programacion"
	palabras[2] = "juego"
	palabras[3] = "adivina"
	palabras[4] = "inteligencia"
	
	total = 5
	intentos = 6
	
	indice = random.randint(1, total)
	largo = len(palabras[indice-1])
	
	print(("Bienvenido/a al juego del Ahorcado!!"))
	print("")
	print(f"La palabra a adivinar tiene: {largo} letras")
	
	resultado = ""
	for i in range(1,largo+1):
		resultado = resultado+"_"
	print(resultado)
	
	while resultado!=palabras[indice-1] and intentos>0:
		print("")
		print(("Ingresa una letra: "))
		letra = input()
		letra = str.lower(letra)
		acierto = False
		print(f"La letra ingresada es:{letra} ")
		
		for i in range(1,largo+1):
			if (palabras[indice-1][i-1:i]==letra):
		         resultado = resultado[0:i-1]+letra+resultado[i:len(resultado)]
		         acierto = True
		         print(f"La letra {letra} està en la palabra: ")
		print(resultado)		
				
		if acierto==False and (palabras[indice-1][i-1:i]!=letra):
			intentos = intentos-1
			print(f"La letra {letra} NO està en la palabra: ")
			print("Intentos restantes: ",intentos)
			print(resultado)
			
	if resultado==palabras[indice-1]:
		print(f"¡Ganaste! La palabra es: {palabras[indice-1]}")
	if intentos==0:
		print(f"Perdiste. La palabra era: {palabras[indice-1]}")

if __name__ == '__main__':
	letra = str()
	inicio(letra)

