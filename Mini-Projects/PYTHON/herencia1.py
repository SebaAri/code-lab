class Persona:
    pass
    def __init__(self):
        self.nombre = input('Ingrese el nombre: ')
        self.edad = int(input('Ingrese la edad: '))
    def pantalla(self): 
        print('{} {} años '.format(self.nombre,self.edad))

class Empleado(Persona):
    pass
    def __init__(self):
        self.sueldo = float(input('Ingrese su sueldo: '))
    def pantalla(self):    
        if self.sueldo > 3000:
            print('con {} de sueldo debe pagar impuestos '.format (self.sueldo))
        else: 
            print('con {} de sueldo no debe pagar impuestos '.format (self.sueldo))

p = Persona()
p.pantalla()
empl= Empleado()
empl.pantalla()