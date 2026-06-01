class Persona:
    pass
    def __init__(self):
        self.nombre = input('Ingrese el nombre: ')
        self.edad = int(input('Ingrese la edad: '))
    def pantalla(self): 
        return '{} {} años '.format(self.nombre,self.edad)

class Empleado(Persona):
    pass
    def __init__(self):
        self.sueldo = float(input('Ingrese su sueldo: '))
    def pantalla(self):    
        if self.sueldo > 3000:
            return 'con {} de sueldo debe pagar impuestos '.format(self.sueldo)
        else: 
            return 'con {} de sueldo no debe pagar impuestos '.format(self.sueldo)

p = Persona()
print(p.pantalla())
empl= Empleado()
print(empl.pantalla())