lista = []
i = 0
while i<5 :
   lista.append(input("Por favor escriba una palabra: "))
   i = i+1
print(lista)
accion = input("Por favor digite: 'insertar', si desea agregar algun elemento a la lista, 'eliminar', si desea borrar algun elemento o escriba 'salir' si no desea hacer nada: ")
if accion == "insertar":
   lista.append(input("Por favor escriba la palabra que desea insertar: "))
   print(lista)
elif accion == "eliminar":
   lista.remove(input("Por favor escriba la palabra que desea eliminar: "))
   print(lista)
else:
   accion == "salir"