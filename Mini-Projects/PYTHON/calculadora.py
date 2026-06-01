import math
#Calculadora
num1 = float(input("Por favor digite un número: "))
num2 = float(input("Por favor digite otro número: "))
#if num1 == -0 or num2 == -0:
    #print("Por favor digite el 0 sin signo")
ope = input("Por favor elija la operación a realizar: suma,resta, multiplicacion o division: ")
print(f"Usted a elegido la siguiente operación: {ope}")
if ope=="suma":
    num = num1 + num2
    print(f"La {ope} es:{num} ")
elif ope =="resta":
    num = num1 - num2
    print(f"La {ope} es:{num} ")
elif ope =="multiplicacion":
    if num1 ==-0 or num2==-0:
       print("La multiplicacion de los 2 nùmeros ingresados da 0")
    else:
        num = num1 * num2
        print(f"La {ope} es: {num}")
if ope == "division":
    if num1 == 0 and num2 == 0:
        print(f"La {ope} de los 2 nùmeros ingresados da error")
    elif num1 > 0 and num2 == 0:
        print(f"La {ope} de los 2 nùmeros ingresados es infinita")
    elif num1 < 0 and num2 == 0:
         print(f"La {ope} de los 2 nùmeros ingresados es -infinita")
    else:
        num = num1 / num2
        print(f"La {ope} es: {num}")