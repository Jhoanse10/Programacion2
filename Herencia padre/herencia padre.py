# Definición de la clase padre Vehiculo
class Vehiculo:
    
    def __init__(self, fecha_fabricacion, VIN_Chasis, VIN_Motor):
        self.fecha_fabricacion = fecha_fabricacion
        self.VIN_Chasis = VIN_Chasis
        self.VIN_Motor = VIN_Motor

    
    def obtener_fecha_fabricacion(self):
        return self.fecha_fabricacion

    
    def obtener_VIN_Chasis(self):
        return self.VIN_Chasis

    
    def obtener_VIN_Motor(self):
        return self.VIN_Motor


class Automovil(Vehiculo):
    
    def __init__(self, fecha_fabricacion, VIN_Chasis, VIN_Motor, marca, modelo, precio):
        
        super().__init__(fecha_fabricacion, VIN_Chasis, VIN_Motor)
        
        self.marca = marca
        self.modelo = modelo
        self.precio = precio

    def obtener_marca(self):
        return self.marca

    
    def obtener_modelo(self):
        return self.modelo

    def obtener_precio(self):
        return self.precio

    def mostrar_datos(self):
        print(f"Fecha de fabricación: {self.obtener_fecha_fabricacion()}")
        print(f"VIN del chasis: {self.obtener_VIN_Chasis()}")
        print(f"VIN del motor: {self.obtener_VIN_Motor()}")
        print(f"Marca: {self.obtener_marca()}")
        print(f"Modelo: {self.obtener_modelo()}")
        print(f"Precio: ${self.obtener_precio():,.2f}")

mi_auto = Automovil("2024-08-17", "1HGCM82633A004352", "EJ204567890", "Toyota", "Corolla", 25000)

print("¡Bienvenido! Aquí están los detalles de tu nuevo automóvil:")
mi_auto.mostrar_datos()