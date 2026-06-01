con ="ALOrca326"
con1 = input("Ingrese la contraseña: ")
for i in [con]:
    i=0
    while con1 != con and i<2:
        con1 = input("Ingrese la contraseña: ")
        i = i+1
if con1 == con:
    print("Contraseña correcta!!")
else:
    con1 != con
    print("Se ha terminado el número de oportunidades: Contraseña incorrecta!!")
print("Gracias!!!")