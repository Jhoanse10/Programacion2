class Usuario:
    def __init__(self, nombre_completo, nickname, clave, tipo, fecha_creacion):
        self.nombre_completo = nombre_completo
        self.nickname = nickname
        self.clave = clave
        self.tipo = tipo
        self.fecha_creacion = fecha_creacion

    
    def __str__(self):
        return (f"Nombre Completo: {self.nombre_completo}\nNickname: {self.nickname}\n"
                f"Clave: {self.clave}\nTipo: {self.tipo}\nFecha de Creación: {self.fecha_creacion}")


usuarios = {}


def agregar_usuario():
    nombre_completo = input("Ingrese el nombre completo: ")
    nickname = input("Ingrese el nickname: ")
    clave = input("Ingrese la clave: ")
    tipo = input("Ingrese el tipo: ")
    fecha_creacion = input("Ingrese la fecha de creación: ")

    usuario = Usuario(nombre_completo, nickname, clave, tipo, fecha_creacion)
    usuarios[nickname] = usuario
    print("Usuario agregado exitosamente.\n")


def buscar_usuario():
    nickname = input("Ingrese el nickname del usuario a buscar: ")
    usuario = usuarios.get(nickname)
    if usuario:
        print(f"Usuario encontrado:\n{usuario}")
    else:
        print("Usuario no encontrado.")


def eliminar_usuario():
    nickname = input("Ingrese el nickname del usuario a eliminar: ")
    if usuarios.pop(nickname, None):
        print("Usuario eliminado exitosamente.")
    else:
        print("Usuario no encontrado.")


def menu():
    while True:
        print("\nMenú:")
        print("1. Agregar Usuario")
        print("2. Buscar Usuario")
        print("3. Eliminar Usuario")
        print("4. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == '1':
            agregar_usuario()
        elif opcion == '2':
            buscar_usuario()
        elif opcion == '3':
            eliminar_usuario()
        elif opcion == '4':
            print("Saliendo...")
            break
        else:
            print("Opción inválida.")


if __name__ == "__main__":
    menu()
