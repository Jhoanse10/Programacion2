from datetime import datetime

class Clientes:
    def __init__(self, cedula, nombre, apellido, telefono, correo, direccion, fecha_nacimiento):
        self.cedula = cedula
        self.nombre = nombre
        self.apellido = apellido
        self.telefono = telefono
        self.correo = correo
        self.direccion = direccion
        self.fecha_nacimiento = fecha_nacimiento

    def obtener_datos(self):
        return {
            "cedula": self.cedula,
            "nombre": self.nombre,
            "apellido": self.apellido,
            "telefono": self.telefono,
            "correo": self.correo,
            "direccion": self.direccion,
            "fecha_nacimiento": self.fecha_nacimiento
        }

    def calcular_edad(self):
        fecha_actual = datetime.now()
        año_nacimiento = int(self.fecha_nacimiento[:4])
        edad = fecha_actual.year - año_nacimiento
        
        if (fecha_actual.month, fecha_actual.day) < (int(self.fecha_nacimiento[5:7]), int(self.fecha_nacimiento[8:10])):
            edad -= 1
        
        return edad

cliente = Clientes("1143377081", "Jhoan", "Diaz", "3022922606", "johanse10@hotmail.com", "san jose de los campanos", "1998/08/21")

edad = cliente.calcular_edad()
mensaje = f"Mi nombre es {cliente.nombre} {cliente.apellido} y vivo en {cliente.direccion} y tengo {edad} años de edad"
print(mensaje)
